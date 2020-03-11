package com.aj5.BancoAJ5.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.aj5.BancoAJ5.domains.Agencia;
import com.aj5.BancoAJ5.repository.AgenciaRepository;

@Service
public class AgenciaService {

	private AgenciaRepository repository;

	public AgenciaService(AgenciaRepository repository) {
		super();
		this.repository = repository;
	}
	
	public List<Agencia> findAll(){
		return this.repository.findAll();
	}
	
	public Optional<Agencia> getById(Long id) {
		return this.repository.findById(id);
	}
	
	public Agencia create(Agencia Agencia) {
		return this.repository.save(Agencia);
	}
	
	public void remove(Long id) {
		this.repository.deleteById(id);
	}
}
