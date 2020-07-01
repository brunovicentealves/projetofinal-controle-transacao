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

import com.aj5.BancoAJ5.domains.PessoaJuridicaContato;
import com.aj5.BancoAJ5.service.PessoaJuridicaContatoService;


@RestController
//@RequestMapping("/pessoaJuridicaContato")
public class PessoaJuridicaContatoController {
	
	private PessoaJuridicaContatoService service;

	public PessoaJuridicaContatoController(PessoaJuridicaContatoService service) {
		this.service = service;
	}
	
	@ApiOperation(value="Consulta todos PessoaJuridicaContatos do sistema", notes="Consulta Assincrona.")
	@GetMapping("/pessoaJuridicaContato")
	public ResponseEntity<List<PessoaJuridicaContato>> getAll(){
		return ResponseEntity.ok(this.service.findAll());
	}
	
	@ApiOperation(value="Consulta PessoaJuridicaContato especifico do sistema", notes="Consulta Assincrona.")
	@GetMapping("/pessoaJuridicaContato/{id}")
	public ResponseEntity<Optional<PessoaJuridicaContato>> getByID(@PathVariable("id") Long id){
		return ResponseEntity.ok(this.service.getById(id));
	}
	
	@ApiOperation(value="Cadastra PessoaJuridicaContato no sistema", notes="Consulta Assincrona.")
	@PostMapping("/cadastraPessoaJuridicaContato")
	public String save(@RequestBody PessoaJuridicaContato PessoaJuridicaContato) {
		return this.service.create(PessoaJuridicaContato).toString();
	}
	
	@ApiOperation(value="Deleta PessoaJuridicaContato especifico do sistema", notes="Consulta Assincrona.")
	@DeleteMapping("/pessoaJuridicaContato/{id}")
    public String delete(@PathVariable("id") Long id) {
    	this.service.remove(id);
    	return "PessoaJuridicaContato " + id + " deletado.";
    }
}
