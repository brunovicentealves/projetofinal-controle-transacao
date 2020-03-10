package com.aj5.BancoAJ5.repository;

import com.aj5.BancoAJ5.domains.Estado;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EstadoRepository extends JpaRepository<Estado,Long> {
}
