package com.aj5.BancoAJ5.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.aj5.BancoAJ5.domains.Taxa;
import com.aj5.BancoAJ5.repository.TaxaRepository;

@Service
public class TaxaService {

	private TaxaRepository repository;

	public TaxaService(TaxaRepository repository) {
		super();
		this.repository = repository;
	}
	
	public List<Taxa> findAll(){
		return this.repository.findAll();
	}
	
	public Optional<Taxa> getById(Long id) {
		return this.repository.findById(id);
	}
	
	public Taxa create(Taxa Taxa) {
		return this.repository.save(Taxa);
	}
	
	public void remove(Long id) {
		this.repository.deleteById(id);
	}
}
