package com.aj5.BancoAJ5.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.aj5.BancoAJ5.domains.PessoaJuridica;
import com.aj5.BancoAJ5.repository.PessoaJuridicaRepository;

@Service
public class PessoaJuridicaService {

	private PessoaJuridicaRepository repository;

	public PessoaJuridicaService(PessoaJuridicaRepository repository) {
		super();
		this.repository = repository;
	}
	
	public List<PessoaJuridica> findAll(){
		return this.repository.findAll();
	}
	
	public Optional<PessoaJuridica> getById(Long id) {
		return this.repository.findById(id);
	}
	
	public PessoaJuridica create(PessoaJuridica PessoaJuridica) {
		return this.repository.save(PessoaJuridica);
	}
	
	public void remove(Long id) {
		this.repository.deleteById(id);
	}
}
