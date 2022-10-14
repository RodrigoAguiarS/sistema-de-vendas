package com.rodrigo.vendas.servico;

import java.util.Optional;

import com.rodrigo.vendas.modelo.Pedido;
import com.rodrigo.vendas.modelo.dto.PedidoDTO;
import com.rodrigo.vendas.modelo.enums.StatusPedido;

public interface PedidoService {
    Pedido salvar( PedidoDTO dto );
    Optional<Pedido> obterPedidoCompleto(Integer id);
    void atualizaStatus(Integer id, StatusPedido statusPedido);
}
