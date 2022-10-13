package com.rodrigo.vendas.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rodrigo.vendas.modelo.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Integer>{
    
    
}
