package com.aj5.BancoAJ5.domains;

import java.util.List;

public class Cidade {
    private long idCidade;
    private String nomeCidade;
    private Estado estado;
    private List<Endereco> enderecoList;

    public Cidade() {
    }


    public Cidade(String nomeCidade, Estado estado) {
        this.nomeCidade = nomeCidade;
        this.estado = estado;
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

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;

    }


    public List<Endereco> getEnderecoList() {
        return enderecoList;
    }

    public void setEnderecoList(List<Endereco> enderecoList) {
        this.enderecoList = enderecoList;
    }
}
