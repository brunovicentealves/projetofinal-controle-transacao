package com.aj5.BancoAJ5.repository;

import com.aj5.BancoAJ5.domains.TipoOperacao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.aj5.BancoAJ5.domains.Operacao;

import java.util.Optional;

@Repository
public interface OperacaoRepository extends JpaRepository<Operacao, Long>{


}
