package com.aj5.BancoAJ5.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.aj5.BancoAJ5.domains.Conta;
import com.aj5.BancoAJ5.repository.ContaRepository;

@Service
public class ContaService {

	private ContaRepository repository;

	public ContaService(ContaRepository repository) {
		super();
		this.repository = repository;
	}
	
	public List<Conta> findAll(){
		return this.repository.findAll();
	}
	
	public Optional<Conta> getById(Long id) {
		return this.repository.findById(id);
	}
	
	public Conta create(Conta Conta) {
		return this.repository.save(Conta);
	}
	
	public void remove(Long id) {
		this.repository.deleteById(id);
	}
}
