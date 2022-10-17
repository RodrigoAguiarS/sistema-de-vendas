package com.rodrigo.vendas.repositorio;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import com.rodrigo.vendas.modelo.Transacao;

public interface TransacaoRepository extends JpaRepository<Transacao, Long>{

    Page<Transacao> findByOrigem_nomeOrDestino_nome(String nomeOrigem, String nomeDestino, Pageable paginacao);


}
