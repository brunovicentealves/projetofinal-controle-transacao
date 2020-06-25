package com.aj5.BancoAJ5.service;

import com.aj5.BancoAJ5.domains.CanalOperacao;
import com.aj5.BancoAJ5.domains.Conta;
import com.aj5.BancoAJ5.domains.Operacao;
import com.aj5.BancoAJ5.domains.TipoOperacao;
import com.aj5.BancoAJ5.dtos.ContaNotFoundException;
import com.aj5.BancoAJ5.repository.ContaRepository;
import com.aj5.BancoAJ5.repository.OperacaoRepository;
import com.aj5.BancoAJ5.repository.TipoOperacaoRepository;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.Optional;

@Service
public class OperacaoSaldoService {

	private OperacaoRepository operacaoRepository;
	private ContaRepository contaRepository;
	private TipoOperacaoRepository tipoOperacaoRepository;

	public OperacaoSaldoService(OperacaoRepository operacaoRepository, ContaRepository contaRepository, TipoOperacaoRepository tipoOperacaoRepository) {
		super();
		this.operacaoRepository = operacaoRepository;
		this.contaRepository = contaRepository;
		this.tipoOperacaoRepository = tipoOperacaoRepository;
	}

	public Double efetuaSaldo(Long idConta, int idCanal) throws ContaNotFoundException {
		// 	VALIDAÇÔES INICIAIS
		// 	verifica se parâmetro idContaOrigem e idConta é nullo e valida
		if( idConta == null || idConta == 0L ){
			// retorna erro
			throw new ContaNotFoundException();
		}

		// 	pega a conta com o idConta
		Optional<Conta> contaOptional = contaRepository.findById(idConta);
		if(contaOptional.isPresent()) {
			Conta conta = contaOptional.get();
			// 	pega o saldo
			Double saldo = conta.getSaldo();

			//busca tipoOperacao
			Optional<TipoOperacao> tipoOperacao = tipoOperacaoRepository.findByNomeTipoOpercacao("SALDO");

			// 	registra operação saque como o parâmetro valorDeposito
			operacaoRepository.salva(tipoOperacao);
			// 	registra operação taxa saque como a taxaDaOperacao
			return saldo;
		}
		throw new ContaNotFoundException();
	}
}
