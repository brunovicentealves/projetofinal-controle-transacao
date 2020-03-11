package com.aj5.BancoAJ5.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.aj5.BancoAJ5.domains.TipoOperacao;
import com.aj5.BancoAJ5.repository.TipoOperacaoRepository;

@Service
public class TipoOperacaoService {

	private TipoOperacaoRepository repository;

	public TipoOperacaoService(TipoOperacaoRepository repository) {
		super();
		this.repository = repository;
	}
	
	public List<TipoOperacao> findAll(){
		return this.repository.findAll();
	}
	
	public Optional<TipoOperacao> getById(Long id) {
		return this.repository.findById(id);
	}
	
	public TipoOperacao create(TipoOperacao TipoOperacao) {
		return this.repository.save(TipoOperacao);
	}
	
	public void remove(Long id) {
		this.repository.deleteById(id);
	}
}
