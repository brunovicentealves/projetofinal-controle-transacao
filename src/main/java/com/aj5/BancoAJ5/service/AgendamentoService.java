package com.aj5.BancoAJ5.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.aj5.BancoAJ5.domains.Agendamento;
import com.aj5.BancoAJ5.repository.AgendamentoRepository;

@Service
public class AgendamentoService {

	private AgendamentoRepository repository;

	public AgendamentoService(AgendamentoRepository repository) {
		super();
		this.repository = repository;
	}
	
	public List<Agendamento> findAll(){
		return this.repository.findAll();
	}
	
	public Optional<Agendamento> getById(Long id) {
		return this.repository.findById(id);
	}
	
	public Agendamento create(Agendamento Agendamento) {
		return this.repository.save(Agendamento);
	}
	
	public void remove(Long id) {
		this.repository.deleteById(id);
	}
}
