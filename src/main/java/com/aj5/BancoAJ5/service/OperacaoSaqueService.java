package com.aj5.BancoAJ5.service;

import com.aj5.BancoAJ5.domains.Conta;
import com.aj5.BancoAJ5.domains.Operacao;
import com.aj5.BancoAJ5.domains.TipoOperacao;
import com.aj5.BancoAJ5.dtos.ContaDto;
import com.aj5.BancoAJ5.dtos.ContaNotFoundException;
import com.aj5.BancoAJ5.repository.ContaRepository;
import com.aj5.BancoAJ5.repository.OperacaoRepository;
import com.aj5.BancoAJ5.repository.TipoOperacaoRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OperacaoSaqueService {

	private OperacaoRepository operacaoRepository;
	private ContaRepository contaRepository;
	private TipoOperacaoRepository tipoOperacaoRepository;

	public OperacaoSaqueService(OperacaoRepository operacaoRepository, ContaRepository contaRepository, TipoOperacaoRepository tipoOperacaoRepository) {
		super();
		this.operacaoRepository = operacaoRepository;
		this.contaRepository = contaRepository;
		this.tipoOperacaoRepository = tipoOperacaoRepository;
	}

	public boolean efetuaSaque(Float valor, Long idConta, int idCanal) throws ContaNotFoundException {
		// 	VALIDAÇÔES INICIAIS
		// 	verifica se parâmetro valor é nullo ou zero
		if( valor == null || valor == 0.0 || valor.isInfinite() || valor.isNaN() ){
			// retorna erro
			return false;
		}
		// 	verifica se parâmetro IdConta é nullo e valida
		if( idConta == null || idConta == 0L ){
			// retorna erro
			return false;
		}

		// 	pega a conta com o idConta
		Optional<Conta> contaOptional = contaRepository.findById(idConta);
		if(contaOptional.isPresent()) {
			Conta conta = contaOptional.get();

			// 	pega o limite operação pelo canal da conta
//			Double limiteCanal = conta.getLimiteCanalConta().contains(SAQUE);
			Double limiteCanal = 0.0;
			// 	verifica se valor é maior que limite operação pelo canal dará erro NÃO_AUTORIZADA
			if (valor > limiteCanal) {
				// retorna erro
				return false;
			}

			// 	pega o saldo
			Double saldo = conta.getSaldo();
			// 	pega o limite
			Double limite = conta.getLimiteCheckEspecial();
			// 	pega a taxaDaOperacao
			Double taxaDaOperacao = conta.getTaxaConta().getTaxa().getValor();
			// 	verifica se saldo + limite é menor que taxaDaOperacao + parâmetro valor: dará erro SALDO_INSUFICENTE
			if (saldo + limite < taxaDaOperacao + valor) {
				// retorna erro
				return false;
			}
			//	saldo recebe taxaDaOperacao + parâmetro valor
			conta.setSaldo(saldo - taxaDaOperacao + valor);

			//busca tipoOperacao
			Optional<TipoOperacao> tipoOperacao = tipoOperacaoRepository.findByNomeTipoOpercacao("SALDO");

			// 	registra operação saque como o parâmetro valor
			operacaoRepository.salva(tipoOperacao);
			// 	registra operação taxa saque como a taxaDaOperacao
		}else{
			throw new ContaNotFoundException();
		}

		return true;
	}
}
