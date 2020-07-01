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

import com.aj5.BancoAJ5.domains.TaxaConta;
import com.aj5.BancoAJ5.service.TaxaContaService;


@RestController
//@RequestMapping("/taxaConta")
public class TaxaContaController {
	
	private TaxaContaService service;

	public TaxaContaController(TaxaContaService service) {
		this.service = service;
	}
	
	@ApiOperation(value="Consulta todos TaxaContas do sistema", notes="Consulta Assincrona.")
	@GetMapping("/taxaConta")
	public ResponseEntity<List<TaxaConta>> getAll(){
		return ResponseEntity.ok(this.service.findAll());
	}
	
	@ApiOperation(value="Consulta TaxaConta especifico do sistema", notes="Consulta Assincrona.")
	@GetMapping("/taxaConta/{id}")
	public ResponseEntity<Optional<TaxaConta>> getByID(@PathVariable("id") Long id){
		return ResponseEntity.ok(this.service.getById(id));
	}
	
	@ApiOperation(value="Cadastra TaxaConta no sistema", notes="Consulta Assincrona.")
	@PostMapping("/cadastraTaxaConta")
	public String save(@RequestBody TaxaConta TaxaConta) {
		return this.service.create(TaxaConta).toString();
	}
	
	@ApiOperation(value="Deleta TaxaConta especifico do sistema", notes="Consulta Assincrona.")
	@DeleteMapping("/taxaConta/{id}")
    public String delete(@PathVariable("id") Long id) {
    	this.service.remove(id);
    	return "TaxaConta " + id + " deletado.";
    }
}
