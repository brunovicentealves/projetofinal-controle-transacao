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

import com.aj5.BancoAJ5.domains.TipoContato;
import com.aj5.BancoAJ5.service.TipoContatoService;


@RestController
@RequestMapping("/tipoContato")
public class TipoContatoController {
	
	private TipoContatoService service;

	public TipoContatoController(TipoContatoService service) {
		this.service = service;
	}
	
	@ApiOperation(value="Consulta todos TipoContatos do sistema", notes="Consulta Assíncrona.")
	@GetMapping
	public ResponseEntity<List<TipoContato>> getAll(){
		return ResponseEntity.ok(this.service.findAll());
	}
	
	@ApiOperation(value="Consulta TipoContato específico do sistema", notes="Consulta Assíncrona.")
	@GetMapping("/{id}")
	public ResponseEntity<Optional<TipoContato>> getByID(@PathVariable("id") Long id){
		return ResponseEntity.ok(this.service.getById(id));
	}
	
	@ApiOperation(value="Cadastra TipoContato no sistema", notes="Consulta Assíncrona.")
	@PostMapping
	public String save(@RequestBody TipoContato TipoContato) {
		return this.service.create(TipoContato).toString();
	}
	
	@ApiOperation(value="Deleta TipoContato específico do sistema", notes="Consulta Assíncrona.")
	@DeleteMapping("/{id}")
    public String delete(@PathVariable("id") Long id) {
    	this.service.remove(id);
    	return "TipoContato " + id + " deletado.";
    }
}
