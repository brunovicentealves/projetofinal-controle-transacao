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

import com.aj5.BancoAJ5.domains.Conta;
import com.aj5.BancoAJ5.service.ContaService;


@RestController
//@RequestMapping("/conta")
public class ContaController {
	
	private ContaService service;

	public ContaController(ContaService service) {
		this.service = service;
	}
	
	@ApiOperation(value="Consulta todos Contas do sistema", notes="Consulta Assincrona.")
	@GetMapping("/conta")
	public ResponseEntity<List<Conta>> getAll(){
		return ResponseEntity.ok(this.service.findAll());
	}
	
	@ApiOperation(value="Consulta Conta especifico do sistema", notes="Consulta Assincrona.")
	@GetMapping("/conta/{id}")
	public ResponseEntity<Optional<Conta>> getByID(@PathVariable("id") Long id){
		return ResponseEntity.ok(this.service.getById(id));
	}
	
	@ApiOperation(value="Cadastra Conta no sistema", notes="Consulta Assincrona.")
	@PostMapping("/cadastraConta")
	public String save(@RequestBody Conta Conta) {
		return this.service.create(Conta).toString();
	}
	
	@ApiOperation(value="Deleta Conta especifico do sistema", notes="Consulta Assincrona.")
	@DeleteMapping("/conta/{id}")
    public String delete(@PathVariable("id") Long id) {
    	this.service.remove(id);
    	return "Conta " + id + " deletado.";
    }
}
