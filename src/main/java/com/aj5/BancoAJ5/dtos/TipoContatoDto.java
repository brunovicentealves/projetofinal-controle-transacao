package com.aj5.BancoAJ5.dtos;

public class TipoContatoDto {

    private String descricao;


    public TipoContatoDto(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
