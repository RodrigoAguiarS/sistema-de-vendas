package com.rodrigo.vendas.repositorio;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rodrigo.vendas.modelo.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {

    Optional<Usuario> findByEmail(String email);

}
