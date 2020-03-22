package com.aj5.BancoAJ5.dtos;

public class EstadoDto {
    private String NomeEstado;
    private String Sigla;


    public EstadoDto(String nomeEstado, String sigla) {
        NomeEstado = nomeEstado;
        Sigla = sigla;
    }

    public String getNomeEstado() {
        return NomeEstado;
    }

    public void setNomeEstado(String nomeEstado) {
        NomeEstado = nomeEstado;
    }

    public String getSigla() {
        return Sigla;
    }

    public void setSigla(String sigla) {
        Sigla = sigla;
    }
}
