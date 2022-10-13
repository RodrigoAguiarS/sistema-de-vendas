package com.rodrigo.vendas.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rodrigo.vendas.modelo.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Integer>{
    
}
