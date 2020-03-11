package com.aj5.BancoAJ5.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.aj5.BancoAJ5.domains.CanalOperacao;
import com.aj5.BancoAJ5.repository.CanalOperacaoRepository;

@Service
public class CanalOperacaoService {

	private CanalOperacaoRepository repository;

	public CanalOperacaoService(CanalOperacaoRepository repository) {
		super();
		this.repository = repository;
	}
	
	public List<CanalOperacao> findAll(){
		return this.repository.findAll();
	}
	
	public Optional<CanalOperacao> getById(Long id) {
		return this.repository.findById(id);
	}
	
	public CanalOperacao create(CanalOperacao CanalOperacao) {
		return this.repository.save(CanalOperacao);
	}
	
	public void remove(Long id) {
		this.repository.deleteById(id);
	}
}
