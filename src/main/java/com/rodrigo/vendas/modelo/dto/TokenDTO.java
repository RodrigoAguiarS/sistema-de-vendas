package com.rodrigo.vendas.modelo.dto;

import lombok.Getter;
import lombok.Setter;
@Setter
@Getter
public class TokenDTO {

    private String token;
    private String tipo;

    public TokenDTO(String token, String tipo) {
        this.token = token;
        this.tipo = tipo;
    }
}
