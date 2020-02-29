package com.aj5.BancoAJ5.domains;

import java.util.List;

public class Endereco {

    private long idEndereco;
    private String nomeEndereco;
    private int  numeroEndereco;
    private long cep;
    private String complemento;
    private Cidade cidade;
    List<Contato> contatoList;

    public Endereco() {
    }

    public Endereco(int numeroEndereco, long cep, String complemento, Cidade cidade) {
        this.numeroEndereco = numeroEndereco;
        this.cep = cep;
        this.complemento = complemento;
        this.cidade = cidade;
    }

    public long getIdEndereco() {
        return idEndereco;
    }

    public String getNomeEndereco() {
        return nomeEndereco;
    }

    public void setNomeEndereco(String nomeEndereco) {
        this.nomeEndereco = nomeEndereco;
    }

    public int getNumeroEndereco() {
        return numeroEndereco;
    }

    public void setNumeroEndereco(int numeroEndereco) {
        this.numeroEndereco = numeroEndereco;
    }

    public long getCep() {
        return cep;
    }

    public void setCep(long cep) {
        this.cep = cep;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public Cidade getCidade() {
        return cidade;
    }

    public void setCidade(Cidade cidade) {
        this.cidade = cidade;
    }

    public List<Contato> getContatoList() {
        return contatoList;
    }

    public void setContatoList(List<Contato> contatoList) {
        this.contatoList = contatoList;
    }
}
