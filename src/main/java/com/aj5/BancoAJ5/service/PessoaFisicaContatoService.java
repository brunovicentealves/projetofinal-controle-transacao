package com.aj5.BancoAJ5.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.aj5.BancoAJ5.domains.PessoaFisicaContato;
import com.aj5.BancoAJ5.repository.PessoaFisicaContatoRepository;

@Service
public class PessoaFisicaContatoService {

	private PessoaFisicaContatoRepository repository;

	public PessoaFisicaContatoService(PessoaFisicaContatoRepository repository) {
		super();
		this.repository = repository;
	}
	
	public List<PessoaFisicaContato> findAll(){
		return this.repository.findAll();
	}
	
	public Optional<PessoaFisicaContato> getById(Long id) {
		return this.repository.findById(id);
	}
	
	public PessoaFisicaContato create(PessoaFisicaContato PessoaFisicaContato) {
		return this.repository.save(PessoaFisicaContato);
	}
	
	public void remove(Long id) {
		this.repository.deleteById(id);
	}
}
