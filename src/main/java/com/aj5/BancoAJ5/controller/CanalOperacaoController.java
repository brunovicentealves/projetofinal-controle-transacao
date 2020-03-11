package com.aj5.BancoAJ5.controller;

import io.swagger.annotations.ApiOperation;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.List;
import java.util.Optional;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.aj5.BancoAJ5.domains.CanalOperacao;
import com.aj5.BancoAJ5.service.CanalOperacaoService;


@RestController
@RequestMapping("/canalOperacao")
public class CanalOperacaoController {
	
	private CanalOperacaoService service;

	public CanalOperacaoController(CanalOperacaoService service) {
		this.service = service;
	}
	
	@ApiOperation(value="Consulta todos CanalOperacaos do sistema", notes="Consulta Assíncrona.")
	@GetMapping
	public ResponseEntity<List<CanalOperacao>> getAll(){
		return ResponseEntity.ok(this.service.findAll());
	}
	
	@ApiOperation(value="Consulta CanalOperacao específico do sistema", notes="Consulta Assíncrona.")
	@GetMapping("/{id}")
	public ResponseEntity<Optional<CanalOperacao>> getByID(@PathVariable("id") Long id){
		return ResponseEntity.ok(this.service.getById(id));
	}
	
	@ApiOperation(value="Cadastra CanalOperacao no sistema", notes="Consulta Assíncrona.")
	@PostMapping
	public String save(@RequestBody CanalOperacao CanalOperacao) {
		return this.service.create(CanalOperacao).toString();
	}
	
	@ApiOperation(value="Deleta CanalOperacao específico do sistema", notes="Consulta Assíncrona.")
	@DeleteMapping("/{id}")
    public String delete(@PathVariable("id") Long id) {
    	this.service.remove(id);
    	return "CanalOperacao " + id + " deletado.";
    }
}
