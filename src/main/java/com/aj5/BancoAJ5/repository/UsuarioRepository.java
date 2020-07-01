package com.aj5.BancoAJ5.repository;

import com.aj5.BancoAJ5.domains.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository  extends JpaRepository<Usuario,Long> {

    Usuario findByLogin(String login);
}
