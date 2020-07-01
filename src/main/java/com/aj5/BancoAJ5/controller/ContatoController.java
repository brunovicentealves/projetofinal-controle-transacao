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

import com.aj5.BancoAJ5.domains.Contato;
import com.aj5.BancoAJ5.service.ContatoService;


@RestController
//@RequestMapping("/contato")
public class ContatoController {
	
	private ContatoService service;

	public ContatoController(ContatoService service) {
		this.service = service;
	}
	
	@ApiOperation(value="Consulta todos Contatos do sistema", notes="Consulta Assincrona.")
	@GetMapping("/contato")
	public ResponseEntity<List<Contato>> getAll(){
		return ResponseEntity.ok(this.service.findAll());
	}
	
	@ApiOperation(value="Consulta Contato especifico do sistema", notes="Consulta Assincrona.")
	@GetMapping("/contato/{id}")
	public ResponseEntity<Optional<Contato>> getByID(@PathVariable("id") Long id){
		return ResponseEntity.ok(this.service.getById(id));
	}
	
	@ApiOperation(value="Cadastra Contato no sistema", notes="Consulta Assincrona.")
	@PostMapping("/cadastraContato")
	public String save(@RequestBody Contato Contato) {
		return this.service.create(Contato).toString();
	}
	
	@ApiOperation(value="Deleta Contato especifico do sistema", notes="Consulta Assincrona.")
	@DeleteMapping("/contato/{id}")
    public String delete(@PathVariable("id") Long id) {
    	this.service.remove(id);
    	return "Contato " + id + " deletado.";
    }
}
