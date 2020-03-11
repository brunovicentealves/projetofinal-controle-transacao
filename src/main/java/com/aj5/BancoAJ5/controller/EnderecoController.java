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

import com.aj5.BancoAJ5.domains.Endereco;
import com.aj5.BancoAJ5.service.EnderecoService;


@RestController
@RequestMapping("/endereco")
public class EnderecoController {
	
	private EnderecoService service;

	public EnderecoController(EnderecoService service) {
		this.service = service;
	}
	
	@ApiOperation(value="Consulta todos Enderecos do sistema", notes="Consulta Assíncrona.")
	@GetMapping
	public ResponseEntity<List<Endereco>> getAll(){
		return ResponseEntity.ok(this.service.findAll());
	}
	
	@ApiOperation(value="Consulta Endereco específico do sistema", notes="Consulta Assíncrona.")
	@GetMapping("/{id}")
	public ResponseEntity<Optional<Endereco>> getByID(@PathVariable("id") Long id){
		return ResponseEntity.ok(this.service.getById(id));
	}
	
	@ApiOperation(value="Cadastra Endereco no sistema", notes="Consulta Assíncrona.")
	@PostMapping
	public String save(@RequestBody Endereco Endereco) {
		return this.service.create(Endereco).toString();
	}
	
	@ApiOperation(value="Deleta Endereco específico do sistema", notes="Consulta Assíncrona.")
	@DeleteMapping("/{id}")
    public String delete(@PathVariable("id") Long id) {
    	this.service.remove(id);
    	return "Endereco " + id + " deletado.";
    }
}
