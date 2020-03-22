package com.aj5.BancoAJ5.dtos;

public class CidadeDto {
    private String nomeCidade;
    private Long idEstado;


    public CidadeDto(String nomeCidade, Long idEstado) {
        this.nomeCidade = nomeCidade;
        this.idEstado = idEstado;
    }

    public String getNomeCidade() {
        return nomeCidade;
    }

    public void setNomeCidade(String nomeCidade) {
        this.nomeCidade = nomeCidade;
    }

    public Long getIdEstado() {
        return idEstado;
    }

    public void setIdEstado(Long idEstado) {
        this.idEstado = idEstado;
    }
}
