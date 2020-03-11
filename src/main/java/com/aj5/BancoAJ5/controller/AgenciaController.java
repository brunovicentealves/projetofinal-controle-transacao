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

import com.aj5.BancoAJ5.domains.Agencia;
import com.aj5.BancoAJ5.service.AgenciaService;


@RestController
@RequestMapping("/agencia")
public class AgenciaController {
	
	private AgenciaService service;

	public AgenciaController(AgenciaService service) {
		this.service = service;
	}
	
	@ApiOperation(value="Consulta todos Agencias do sistema", notes="Consulta Assíncrona.")
	@GetMapping
	public ResponseEntity<List<Agencia>> getAll(){
		return ResponseEntity.ok(this.service.findAll());
	}
	
	@ApiOperation(value="Consulta Agencia específico do sistema", notes="Consulta Assíncrona.")
	@GetMapping("/{id}")
	public ResponseEntity<Optional<Agencia>> getByID(@PathVariable("id") Long id){
		return ResponseEntity.ok(this.service.getById(id));
	}
	
	@ApiOperation(value="Cadastra Agencia no sistema", notes="Consulta Assíncrona.")
	@PostMapping
	public String save(@RequestBody Agencia Agencia) {
		return this.service.create(Agencia).toString();
	}
	
	@ApiOperation(value="Deleta Agencia específico do sistema", notes="Consulta Assíncrona.")
	@DeleteMapping("/{id}")
    public String delete(@PathVariable("id") Long id) {
    	this.service.remove(id);
    	return "Agencia " + id + " deletada.";
    }
}
