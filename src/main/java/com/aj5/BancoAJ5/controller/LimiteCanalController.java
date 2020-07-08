package com.aj5.BancoAJ5.controller;

import io.swagger.annotations.ApiOperation;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;
import java.util.Optional;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.aj5.BancoAJ5.domains.LimiteCanal;
import com.aj5.BancoAJ5.service.LimiteCanalService;


@RestController
//@RequestMapping("/limiteCanal")
public class LimiteCanalController {
	
	private LimiteCanalService service;

	public LimiteCanalController(LimiteCanalService service) {
		this.service = service;
	}
	
	@ApiOperation(value="Consulta todos LimiteCanals do sistema", notes="Consulta Assincrona.")
	@GetMapping("/limiteCanal")
	public ResponseEntity<List<LimiteCanal>> getAll(){
		return ResponseEntity.ok(this.service.findAll());
	}
	
	@ApiOperation(value="Consulta LimiteCanal especifico do sistema", notes="Consulta Assincrona.")
	@GetMapping("/limiteCanal/{id}")
	public ResponseEntity<Optional<LimiteCanal>> getByID(@PathVariable("id") Long id){
		return ResponseEntity.ok(this.service.getById(id));
	}
	
	@ApiOperation(value="Cadastra LimiteCanal no sistema", notes="Consulta Assincrona.")
	@PostMapping("/CadastraLimiteCanal")
	public String save(@RequestBody LimiteCanal LimiteCanal) {
		return this.service.create(LimiteCanal).toString();
	}
	
	@ApiOperation(value="Deleta LimiteCanal especifico do sistema", notes="Consulta Assincrona.")
	@DeleteMapping("/limiteCanal/{id}")
    public String delete(@PathVariable("id") Long id) {
    	this.service.remove(id);
    	return "LimiteCanal " + id + " deletado.";
    }
}
