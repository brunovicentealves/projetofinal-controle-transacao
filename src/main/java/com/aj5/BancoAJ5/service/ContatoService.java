package com.aj5.BancoAJ5.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.aj5.BancoAJ5.domains.Contato;
import com.aj5.BancoAJ5.repository.ContatoRepository;

@Service
public class ContatoService {

	private ContatoRepository repository;

	public ContatoService(ContatoRepository repository) {
		super();
		this.repository = repository;
	}
	
	public List<Contato> findAll(){
		return this.repository.findAll();
	}
	
	public Optional<Contato> getById(Long id) {
		return this.repository.findById(id);
	}
	
	public Contato create(Contato Contato) {
		return this.repository.save(Contato);
	}
	
	public void remove(Long id) {
		this.repository.deleteById(id);
	}
}
