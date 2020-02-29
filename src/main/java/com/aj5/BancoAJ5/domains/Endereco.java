package com.aj5.BancoAJ5.domains;

public class Endereco {

    private long idEndereco;
    private int  numeroEndereco;
    private long cep;
    private String complemento;
    //Nao implentado o  relacionamento
    private long idCidade;
    private Cidade cidade;

    public Endereco() {
    }

    public Endereco(long idEndereco, int numeroEndereco, long cep, String complemento) {
        this.idEndereco = idEndereco;
        this.numeroEndereco = numeroEndereco;
        this.cep = cep;
        this.complemento = complemento;
    }


    public long getIdEndereco() {
        return idEndereco;
    }

    public void setIdEndereco(long idEndereco) {
        this.idEndereco = idEndereco;
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
}
