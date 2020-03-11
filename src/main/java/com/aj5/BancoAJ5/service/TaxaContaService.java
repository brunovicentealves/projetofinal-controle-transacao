package com.aj5.BancoAJ5.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.aj5.BancoAJ5.domains.TaxaConta;
import com.aj5.BancoAJ5.repository.TaxaContaRepository;

@Service
public class TaxaContaService {

	private TaxaContaRepository repository;

	public TaxaContaService(TaxaContaRepository repository) {
		super();
		this.repository = repository;
	}
	
	public List<TaxaConta> findAll(){
		return this.repository.findAll();
	}
	
	public Optional<TaxaConta> getById(Long id) {
		return this.repository.findById(id);
	}
	
	public TaxaConta create(TaxaConta TaxaConta) {
		return this.repository.save(TaxaConta);
	}
	
	public void remove(Long id) {
		this.repository.deleteById(id);
	}
}
