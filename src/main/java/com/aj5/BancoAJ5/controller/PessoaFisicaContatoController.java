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

import com.aj5.BancoAJ5.domains.PessoaFisicaContato;
import com.aj5.BancoAJ5.service.PessoaFisicaContatoService;


@RestController
//@RequestMapping("/pessoaFisicaContato")
public class PessoaFisicaContatoController {
	
	private PessoaFisicaContatoService service;

	public PessoaFisicaContatoController(PessoaFisicaContatoService service) {
		this.service = service;
	}
	
	@ApiOperation(value="Consulta todos PessoaFisicaContatos do sistema", notes="Consulta Assincrona.")
	@GetMapping("/pessoaFisicaContato")
	public ResponseEntity<List<PessoaFisicaContato>> getAll(){
		return ResponseEntity.ok(this.service.findAll());
	}
	
	@ApiOperation(value="Consulta PessoaFisicaContato especifico do sistema", notes="Consulta Assincrona.")
	@GetMapping("/pessoaFisiscaContato/{id}")
	public ResponseEntity<Optional<PessoaFisicaContato>> getByID(@PathVariable("id") Long id){
		return ResponseEntity.ok(this.service.getById(id));
	}
	
	@ApiOperation(value="Cadastra PessoaFisicaContato no sistema", notes="Consulta Assincrona.")
	@PostMapping("/cadastraPessoaFisicaContato")
	public String save(@RequestBody PessoaFisicaContato PessoaFisicaContato) {
		return this.service.create(PessoaFisicaContato).toString();
	}
	
	@ApiOperation(value="Deleta PessoaFisicaContato especifico do sistema", notes="Consulta Assincrona.")
	@DeleteMapping("/pessoaFisicaContato/{id}")
    public String delete(@PathVariable("id") Long id) {
    	this.service.remove(id);
    	return "PessoaFisicaContato " + id + " deletado.";
    }
}
