package com.aj5.BancoAJ5.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.aj5.BancoAJ5.domains.Estado;
import com.aj5.BancoAJ5.service.EstadoService;

@RestController
@RequestMapping("/estado")
public class EstadoController {
	
	private EstadoService service;

	public EstadoController(EstadoService service) {
		this.service = service;
	}
	
	@GetMapping
	public ResponseEntity<List<Estado>> getAll(){
		return ResponseEntity.ok(this.service.findAll());
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Optional<Estado>> getByID(@PathVariable("id") Long id){
		return ResponseEntity.ok(this.service.getById(id));
	}
	
	@PostMapping
	public String save(@RequestBody Estado estado) {
		return this.service.create(estado).toString();
	}
	
	@DeleteMapping("/{id}")
    public String delete(@PathVariable("id") Long id) {
    	this.service.remove(id);
    	return "Estado " + id.toString() + " deletado.";
    }
	
	
}
