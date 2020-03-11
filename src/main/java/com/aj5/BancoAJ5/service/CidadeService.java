package com.aj5.BancoAJ5.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.aj5.BancoAJ5.domains.Cidade;
import com.aj5.BancoAJ5.repository.CidadeRepository;

@Service
public class CidadeService {

	private CidadeRepository repository;

	public CidadeService(CidadeRepository repository) {
		super();
		this.repository = repository;
	}
	
	public List<Cidade> findAll(){
		return this.repository.findAll();
	}
	
	public Optional<Cidade> getById(Long id) {
		return this.repository.findById(id);
	}
	
	public Cidade create(Cidade Cidade) {
		return this.repository.save(Cidade);
	}
	
	public void remove(Long id) {
		this.repository.deleteById(id);
	}
}
