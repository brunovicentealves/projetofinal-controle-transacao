package com.aj5.BancoAJ5.controller;

import io.swagger.annotations.ApiOperation;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.List;
import java.util.Optional;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.RestController;

import com.aj5.BancoAJ5.domains.Estado;
import com.aj5.BancoAJ5.service.EstadoService;

@RestController
//@RequestMapping("/estado")
public class EstadoController {
	
	private EstadoService service;

	public EstadoController(EstadoService service) {
		this.service = service;
	}
	

	@ApiOperation(value="Consulta todos estados do sistema", notes="Consulta Assincrona.")
	@GetMapping("/estado")
	public ResponseEntity<List<Estado>> getAll(){
		return ResponseEntity.ok(this.service.findAll());
	}
	

	@ApiOperation(value="Consulta estado especifico do sistema", notes="Consulta Assincrona.")
	@GetMapping("/estado/{id}")
	public ResponseEntity<Optional<Estado>> getByID(@PathVariable("id") Long id){
		return ResponseEntity.ok(this.service.getById(id));
	}
	
	@ApiOperation(value="Cadastra estado no sistema", notes="Consulta Assincrona.")
	@PostMapping("/cadastraEstado")
	public String save(@RequestBody Estado estado) {
		return this.service.create(estado).toString();
	}
	
	@ApiOperation(value="Deleta estado especifico do sistema", notes="Consulta Assincrona.")
	@DeleteMapping("/estado/{id}")
    public String delete(@PathVariable("id") Long id) {
    	this.service.remove(id);
    	return "Estado " + id + " deletado.";
    }
}
