package com.aj5.BancoAJ5.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.aj5.BancoAJ5.domains.TipoContato;
import com.aj5.BancoAJ5.repository.TipoContatoRepository;

@Service
public class TipoContatoService {

	private TipoContatoRepository repository;

	public TipoContatoService(TipoContatoRepository repository) {
		super();
		this.repository = repository;
	}
	
	public List<TipoContato> findAll(){
		return this.repository.findAll();
	}
	
	public Optional<TipoContato> getById(Long id) {
		return this.repository.findById(id);
	}
	
	public TipoContato create(TipoContato TipoContato) {
		return this.repository.save(TipoContato);
	}
	
	public void remove(Long id) {
		this.repository.deleteById(id);
	}
}
