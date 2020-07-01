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

import com.aj5.BancoAJ5.domains.PessoaFisica;
import com.aj5.BancoAJ5.service.PessoaFisicaService;


@RestController
//@RequestMapping("/pessoaFisica")
public class PessoaFisicaController {
	
	private PessoaFisicaService service;

	public PessoaFisicaController(PessoaFisicaService service) {
		this.service = service;
	}
	
	@ApiOperation(value="Consulta todos PessoaFisicas do sistema", notes="Consulta Assincrona.")
	@GetMapping("/pessoaFisica")
	public ResponseEntity<List<PessoaFisica>> getAll(){
		return ResponseEntity.ok(this.service.findAll());
	}
	
	@ApiOperation(value="Consulta PessoaFisica especifico do sistema", notes="Consulta Assincrona.")
	@GetMapping("/pessoaFisica/{id}")
	public ResponseEntity<Optional<PessoaFisica>> getByID(@PathVariable("id") Long id){
		return ResponseEntity.ok(this.service.getById(id));
	}
	
	@ApiOperation(value="Cadastra PessoaFisica no sistema", notes="Consulta Assincrona.")
	@PostMapping("/cadastraPessoaFisica")
	public String save(@RequestBody PessoaFisica PessoaFisica) {
		return this.service.create(PessoaFisica).toString();
	}
	
	@ApiOperation(value="Deleta PessoaFisica especifico do sistema", notes="Consulta Assincrona.")
	@DeleteMapping("/pessoaFisica/{id}")
    public String delete(@PathVariable("id") Long id) {
    	this.service.remove(id);
    	return "PessoaFisica " + id + " deletado.";
    }
}
