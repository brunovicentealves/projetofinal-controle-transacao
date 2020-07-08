package com.aj5.BancoAJ5.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.aj5.BancoAJ5.domains.TipoOperacao;

import java.util.Optional;

@Repository
public interface TipoOperacaoRepository extends JpaRepository<TipoOperacao, Long>{


    Optional<TipoOperacao> findBynomeTipoOperacao(String nomeTipoOperacao);
}
