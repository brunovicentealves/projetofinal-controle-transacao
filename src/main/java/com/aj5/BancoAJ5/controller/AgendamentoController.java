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

import com.aj5.BancoAJ5.domains.Agendamento;
import com.aj5.BancoAJ5.service.AgendamentoService;


@RestController
@RequestMapping("/agendamento")
public class AgendamentoController {
	
	private AgendamentoService service;

	public AgendamentoController(AgendamentoService service) {
		this.service = service;
	}
	
	@ApiOperation(value="Consulta todos Agendamentos do sistema", notes="Consulta Assíncrona.")
	@GetMapping
	public ResponseEntity<List<Agendamento>> getAll(){
		return ResponseEntity.ok(this.service.findAll());
	}
	
	@ApiOperation(value="Consulta Agendamento específico do sistema", notes="Consulta Assíncrona.")
	@GetMapping("/{id}")
	public ResponseEntity<Optional<Agendamento>> getByID(@PathVariable("id") Long id){
		return ResponseEntity.ok(this.service.getById(id));
	}
	
	@ApiOperation(value="Cadastra Agendamento no sistema", notes="Consulta Assíncrona.")
	@PostMapping
	public String save(@RequestBody Agendamento Agendamento) {
		return this.service.create(Agendamento).toString();
	}
	
	@ApiOperation(value="Deleta Agendamento específico do sistema", notes="Consulta Assíncrona.")
	@DeleteMapping("/{id}")
    public String delete(@PathVariable("id") Long id) {
    	this.service.remove(id);
    	return "Agendamento " + id + " deletado.";
    }
}
