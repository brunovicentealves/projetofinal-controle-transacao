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

import com.aj5.BancoAJ5.domains.LimiteCanalConta;
import com.aj5.BancoAJ5.service.LimiteCanalContaService;


@RestController
//@RequestMapping("/limiteCanalConta")
public class LimiteCanalContaController {
	
	private LimiteCanalContaService service;

	public LimiteCanalContaController(LimiteCanalContaService service) {
		this.service = service;
	}
	
	@ApiOperation(value="Consulta todos LimiteCanalContas do sistema", notes="Consulta Assincrona.")
	@GetMapping("/limiteCanalConta")
	public ResponseEntity<List<LimiteCanalConta>> getAll(){
		return ResponseEntity.ok(this.service.findAll());
	}
	
	@ApiOperation(value="Consulta LimiteCanalConta especifico do sistema", notes="Consulta Assincrona.")
	@GetMapping("/limiteCanalConta/{id}")
	public ResponseEntity<Optional<LimiteCanalConta>> getByID(@PathVariable("id") Long id){
		return ResponseEntity.ok(this.service.getById(id));
	}
	
	@ApiOperation(value="Cadastra LimiteCanalConta no sistema", notes="Consulta Assincrona.")
	@PostMapping("/cadastraLimiteCanalConta")
	public String save(@RequestBody LimiteCanalConta LimiteCanalConta) {
		return this.service.create(LimiteCanalConta).toString();
	}
	
	@ApiOperation(value="Deleta LimiteCanalConta especifico do sistema", notes="Consulta Assincrona.")
	@DeleteMapping("/limiteCanalConta/{id}")
    public String delete(@PathVariable("id") Long id) {
    	this.service.remove(id);
    	return "LimiteCanalConta " + id + " deletado.";
    }
}
