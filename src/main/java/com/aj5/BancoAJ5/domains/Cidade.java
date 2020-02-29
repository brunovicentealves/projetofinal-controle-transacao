package com.aj5.BancoAJ5.domains;

public class Cidade {
    private long idCidade;
    private String nomeCidade;

    public Cidade() {
    }

    public Cidade(String nomeCidade) {
        this.nomeCidade = nomeCidade;
    }


    public long getIdCidade() {
        return idCidade;
    }


    public String getNomeCidade() {
        return nomeCidade;
    }

    public void setNomeCidade(String nomeCidade) {
        this.nomeCidade = nomeCidade;
    }
}
