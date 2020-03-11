package com.aj5.BancoAJ5.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.aj5.BancoAJ5.domains.PessoaJuridicaContato;
import com.aj5.BancoAJ5.repository.PessoaJuridicaContatoRepository;

@Service
public class PessoaJuridicaContatoService {

	private PessoaJuridicaContatoRepository repository;

	public PessoaJuridicaContatoService(PessoaJuridicaContatoRepository repository) {
		super();
		this.repository = repository;
	}
	
	public List<PessoaJuridicaContato> findAll(){
		return this.repository.findAll();
	}
	
	public Optional<PessoaJuridicaContato> getById(Long id) {
		return this.repository.findById(id);
	}
	
	public PessoaJuridicaContato create(PessoaJuridicaContato PessoaJuridicaContato) {
		return this.repository.save(PessoaJuridicaContato);
	}
	
	public void remove(Long id) {
		this.repository.deleteById(id);
	}
}
