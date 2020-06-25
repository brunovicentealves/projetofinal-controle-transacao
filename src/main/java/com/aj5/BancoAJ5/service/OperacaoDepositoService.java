package com.aj5.BancoAJ5.service;

import com.aj5.BancoAJ5.domains.Conta;
import com.aj5.BancoAJ5.domains.Operacao;
import com.aj5.BancoAJ5.domains.TipoOperacao;
import com.aj5.BancoAJ5.dtos.ContaNotFoundException;
import com.aj5.BancoAJ5.repository.ContaRepository;
import com.aj5.BancoAJ5.repository.OperacaoRepository;
import com.aj5.BancoAJ5.repository.TipoOperacaoRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class OperacaoDepositoService {

	private OperacaoRepository operacaoRepository;
	private ContaRepository contaRepository;
	private TipoOperacaoRepository tipoOperacaoRepository;

	public OperacaoDepositoService(OperacaoRepository operacaoRepository, ContaRepository contaRepository, TipoOperacaoRepository tipoOperacaoRepository) {
		super();
		this.operacaoRepository = operacaoRepository;
		this.contaRepository = contaRepository;
		this.tipoOperacaoRepository = tipoOperacaoRepository;
	}

	public boolean efetuaDeposito(Float valorDeposito, Long idContaDestino, int idCanal) throws ContaNotFoundException {
		// 	VALIDAÇÔES INICIAIS
		// 	verifica se parâmetro valorDeposito é nullo ou zero
		if( valorDeposito == null || valorDeposito == 0.0 || valorDeposito.isInfinite() || valorDeposito.isNaN() ){
			// retorna erro
			return false;
		}
		// 	verifica se parâmetro idContaOrigem e idContaDestino é nullo e valida
		if( idContaDestino == null || idContaDestino == 0L ){
			// retorna erro
			return false;
		}

		// 	pega a conta com o idConta
		Optional<Conta> contaOptional = contaRepository.findById(idContaDestino);
		if(contaOptional.isPresent()) {
			Conta conta = contaOptional.get();

			// 	pega o saldo
			Double saldo = conta.getSaldo();

			//	saldo recebe + parâmetro valorDeposito
			conta.setSaldo(saldo + valorDeposito);

			//busca tipoOperacao
			Optional<TipoOperacao> tipoOperacao = tipoOperacaoRepository.findByNomeTipoOpercacao("DEPOSITO");

			// 	registra operação saque como o parâmetro valorDeposito
			operacaoRepository.salva(tipoOperacao);
			// 	registra operação taxa saque como a taxaDaOperacao
		}else{
			throw new ContaNotFoundException();
		}

		return true;
	}
}
