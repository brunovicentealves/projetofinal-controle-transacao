package com.aj5.BancoAJ5.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.aj5.BancoAJ5.domains.Estado;
import com.aj5.BancoAJ5.repository.EstadoRepository;

@Service
public class EstadoService {

	private EstadoRepository repository;

	public EstadoService(EstadoRepository repository) {
		super();
		this.repository = repository;
	}
	
	public List<Estado> findAll(){
		return this.repository.findAll();
	}
	
	public Optional<Estado> getById(Long id) {
		return this.repository.findById(id);
	}
	
	public Estado create(Estado estado) {
		return this.repository.save(estado);
	}
	
	public void remove(Long id) {
		this.repository.deleteById(id);
	}
}
