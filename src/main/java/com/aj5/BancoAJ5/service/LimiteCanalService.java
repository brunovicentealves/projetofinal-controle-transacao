package com.aj5.BancoAJ5.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.aj5.BancoAJ5.domains.LimiteCanal;
import com.aj5.BancoAJ5.repository.LimiteCanalRepository;

@Service
public class LimiteCanalService {

	private LimiteCanalRepository repository;

	public LimiteCanalService(LimiteCanalRepository repository) {
		super();
		this.repository = repository;
	}
	
	public List<LimiteCanal> findAll(){
		return this.repository.findAll();
	}
	
	public Optional<LimiteCanal> getById(Long id) {
		return this.repository.findById(id);
	}
	
	public LimiteCanal create(LimiteCanal LimiteCanal) {
		return this.repository.save(LimiteCanal);
	}
	
	public void remove(Long id) {
		this.repository.deleteById(id);
	}
}
