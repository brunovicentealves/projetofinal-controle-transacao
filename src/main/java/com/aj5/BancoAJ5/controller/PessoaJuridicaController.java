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

import com.aj5.BancoAJ5.domains.PessoaJuridica;
import com.aj5.BancoAJ5.service.PessoaJuridicaService;


@RestController
@RequestMapping("/pessoaJuridica")
public class PessoaJuridicaController {
	
	private PessoaJuridicaService service;

	public PessoaJuridicaController(PessoaJuridicaService service) {
		this.service = service;
	}
	
	@ApiOperation(value="Consulta todos PessoaJuridicas do sistema", notes="Consulta Assíncrona.")
	@GetMapping
	public ResponseEntity<List<PessoaJuridica>> getAll(){
		return ResponseEntity.ok(this.service.findAll());
	}
	
	@ApiOperation(value="Consulta PessoaJuridica específico do sistema", notes="Consulta Assíncrona.")
	@GetMapping("/{id}")
	public ResponseEntity<Optional<PessoaJuridica>> getByID(@PathVariable("id") Long id){
		return ResponseEntity.ok(this.service.getById(id));
	}
	
	@ApiOperation(value="Cadastra PessoaJuridica no sistema", notes="Consulta Assíncrona.")
	@PostMapping
	public String save(@RequestBody PessoaJuridica PessoaJuridica) {
		return this.service.create(PessoaJuridica).toString();
	}
	
	@ApiOperation(value="Deleta PessoaJuridica específico do sistema", notes="Consulta Assíncrona.")
	@DeleteMapping("/{id}")
    public String delete(@PathVariable("id") Long id) {
    	this.service.remove(id);
    	return "PessoaJuridica " + id + " deletado.";
    }
}
