package com.aj5.BancoAJ5.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.aj5.BancoAJ5.domains.Operacao;
import com.aj5.BancoAJ5.repository.OperacaoRepository;

@Service
public class OperacaoService {

	private OperacaoRepository repository;

	public OperacaoService(OperacaoRepository repository) {
		super();
		this.repository = repository;
	}
	
	public List<Operacao> findAll(){
		return this.repository.findAll();
	}
	
	public Optional<Operacao> getById(Long id) {
		return this.repository.findById(id);
	}
	
	public Operacao create(Operacao Operacao) {
		return this.repository.save(Operacao);
	}
	
	public void remove(Long id) {
		this.repository.deleteById(id);
	}
}
