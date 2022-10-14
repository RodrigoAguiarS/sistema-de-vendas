package com.rodrigo.vendas.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rodrigo.vendas.modelo.ItemPedido;

public interface ItemPedidoRepository extends JpaRepository<ItemPedido, Integer>{
    
}
