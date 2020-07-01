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

import com.aj5.BancoAJ5.domains.Cidade;
import com.aj5.BancoAJ5.service.CidadeService;


@RestController
//@RequestMapping("/cidade")
public class CidadeController {
	
	private CidadeService service;

	public CidadeController(CidadeService service) {
		this.service = service;
	}
	
	@ApiOperation(value="Consulta todos Cidades do sistema", notes="Consulta Assincrona.")
	@GetMapping("/cidade")
	public ResponseEntity<List<Cidade>> getAll(){
		return ResponseEntity.ok(this.service.findAll());
	}
	
	@ApiOperation(value="Consulta Cidade especifico do sistema", notes="Consulta Assincrona.")
	@GetMapping("/cidade/{id}")
	public ResponseEntity<Optional<Cidade>> getByID(@PathVariable("id") Long id){
		return ResponseEntity.ok(this.service.getById(id));
	}
	
	@ApiOperation(value="Cadastra Cidade no sistema", notes="Consulta Assincrona.")
	@PostMapping("cadastraCidade")
	public String save(@RequestBody Cidade Cidade) {
		return this.service.create(Cidade).toString();
	}
	
	@ApiOperation(value="Deleta Cidade especifico do sistema", notes="Consulta Assincrona.")
	@DeleteMapping("/cidade/{id}")
    public String delete(@PathVariable("id") Long id) {
    	this.service.remove(id);
    	return "Cidade " + id + " deletado.";
    }
}
