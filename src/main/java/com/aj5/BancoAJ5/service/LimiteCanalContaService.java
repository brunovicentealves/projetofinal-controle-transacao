package com.aj5.BancoAJ5.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.aj5.BancoAJ5.domains.LimiteCanalConta;
import com.aj5.BancoAJ5.repository.LimiteCanalContaRepository;

@Service
public class LimiteCanalContaService {

	private LimiteCanalContaRepository repository;

	public LimiteCanalContaService(LimiteCanalContaRepository repository) {
		super();
		this.repository = repository;
	}
	
	public List<LimiteCanalConta> findAll(){
		return this.repository.findAll();
	}
	
	public Optional<LimiteCanalConta> getById(Long id) {
		return this.repository.findById(id);
	}
	
	public LimiteCanalConta create(LimiteCanalConta LimiteCanalConta) {
		return this.repository.save(LimiteCanalConta);
	}
	
	public void remove(Long id) {
		this.repository.deleteById(id);
	}
}
