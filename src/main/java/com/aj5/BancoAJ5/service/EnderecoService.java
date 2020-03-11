package com.aj5.BancoAJ5.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.aj5.BancoAJ5.domains.Endereco;
import com.aj5.BancoAJ5.repository.EnderecoRepository;

@Service
public class EnderecoService {

	private EnderecoRepository repository;

	public EnderecoService(EnderecoRepository repository) {
		super();
		this.repository = repository;
	}
	
	public List<Endereco> findAll(){
		return this.repository.findAll();
	}
	
	public Optional<Endereco> getById(Long id) {
		return this.repository.findById(id);
	}
	
	public Endereco create(Endereco Endereco) {
		return this.repository.save(Endereco);
	}
	
	public void remove(Long id) {
		this.repository.deleteById(id);
	}
}
