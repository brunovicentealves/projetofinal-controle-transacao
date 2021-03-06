package com.aj5.BancoAJ5.controller;

import com.aj5.BancoAJ5.domains.Operacao;
import com.aj5.BancoAJ5.service.OperacaoService;
import io.swagger.annotations.ApiOperation;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;


@RestController
//RequestMapping("/operacaosaque")
public class OperacaoSaqueController {

	private OperacaoService service;

	public OperacaoSaqueController(OperacaoService service) {
		this.service = service;
	}
	
	@ApiOperation(value="Consulta todos Operacaos do sistema", notes="Consulta Assincrona.")
	@GetMapping("/operacaoSaque")
	public ResponseEntity<List<Operacao>> getAll(){
		return ResponseEntity.ok(this.service.findAll());
	}
	
	@ApiOperation(value="Consulta Operacao especifico do sistema", notes="Consulta Assincrona.")
	@GetMapping("/operacaoSaque/{id}")
	public ResponseEntity<Optional<Operacao>> getByID(@PathVariable("id") Long id){
		return ResponseEntity.ok(this.service.getById(id));
	}
	
	@ApiOperation(value="Cadastra Operacao no sistema", notes="Consulta Assincrona.")
	@PostMapping("/cadastraOperacaoSaque")
	public String save(@RequestBody Operacao Operacao) {
		return this.service.create(Operacao).toString();
	}
	
	@ApiOperation(value="Deleta Operacao específico do sistema", notes="Consulta Assincrona.")
	@DeleteMapping("/operacaoSaque/{id}")
    public String delete(@PathVariable("id") Long id) {
    	this.service.remove(id);
    	return "Operacao " + id + " deletado.";
    }
}
