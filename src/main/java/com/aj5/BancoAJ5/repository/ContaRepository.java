package com.aj5.BancoAJ5.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.aj5.BancoAJ5.domains.Conta;

import java.util.Optional;

@Repository
public interface ContaRepository extends JpaRepository<Conta, Long>{

    Optional<Conta> findBynumeroConta(Long numeroconta);
}
