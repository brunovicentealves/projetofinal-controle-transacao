package com.aj5.BancoAJ5.dtos;

public class PessoaJuridicaContatoDto {

    private long idPessoaJuridica;

    private long idContato;


    public PessoaJuridicaContatoDto(long idPessoaJuridica, long idContato) {
        this.idPessoaJuridica = idPessoaJuridica;
        this.idContato = idContato;
    }

    public long getIdPessoaJuridica() {
        return idPessoaJuridica;
    }

    public void setIdPessoaJuridica(long idPessoaJuridica) {
        this.idPessoaJuridica = idPessoaJuridica;
    }

    public long getIdContato() {
        return idContato;
    }

    public void setIdContato(long idContato) {
        this.idContato = idContato;
    }
}
