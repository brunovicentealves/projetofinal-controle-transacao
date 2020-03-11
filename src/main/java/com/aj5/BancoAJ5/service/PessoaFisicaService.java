package com.aj5.BancoAJ5.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.aj5.BancoAJ5.domains.PessoaFisica;
import com.aj5.BancoAJ5.repository.PessoaFisicaRepository;

@Service
public class PessoaFisicaService {

	private PessoaFisicaRepository repository;

	public PessoaFisicaService(PessoaFisicaRepository repository) {
		super();
		this.repository = repository;
	}
	
	public List<PessoaFisica> findAll(){
		return this.repository.findAll();
	}
	
	public Optional<PessoaFisica> getById(Long id) {
		return this.repository.findById(id);
	}
	
	public PessoaFisica create(PessoaFisica PessoaFisica) {
		return this.repository.save(PessoaFisica);
	}
	
	public void remove(Long id) {
		this.repository.deleteById(id);
	}
}
