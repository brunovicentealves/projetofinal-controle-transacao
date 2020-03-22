package com.aj5.BancoAJ5.dtos;

public class EnderecoDto {
    private String  nomeEndereco;
    private int numeroEndereco;
    private long cep;
    private String complemento;
    private long idCidadade;

    public EnderecoDto(String nomeEndereco, int numeroEndereco, long cep, String complemento, long idCidadade) {
        this.nomeEndereco = nomeEndereco;
        this.numeroEndereco = numeroEndereco;
        this.cep = cep;
        this.complemento = complemento;
        this.idCidadade = idCidadade;
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

    public long getIdCidadade() {
        return idCidadade;
    }

    public void setIdCidadade(long idCidadade) {
        this.idCidadade = idCidadade;
    }
}
