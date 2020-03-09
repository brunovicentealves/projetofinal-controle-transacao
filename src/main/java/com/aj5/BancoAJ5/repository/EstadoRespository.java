package com.aj5.BancoAJ5.repository;

import com.aj5.BancoAJ5.domains.Estado;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EstadoRespository extends CrudRepository<Estado,Long> {
}
