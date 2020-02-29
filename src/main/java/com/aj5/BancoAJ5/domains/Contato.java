package com.aj5.BancoAJ5.domains;

import java.util.List;

public class Contato {
    private long idContato;
    private String telefone;

    //não implementado a relacao
    private Endereco endereco;
    private TipoContato tipoContato;

    private List<PessoaFisicaContato> pessoaFisicaContatoList;
    private List<PessoaJuridicaContato> pessoaJuridicaContatoList;

    public Contato() {
    }

    public Contato( String telefone, Endereco endereco, TipoContato tipoContato) {
        this.telefone = telefone;
        this.endereco = endereco;
        this.tipoContato = tipoContato;
    }

    public long getIdContato() {
        return idContato;
    }


    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public TipoContato getTipoContato() {
        return tipoContato;
    }

    public void setTipoContato(TipoContato tipoContato) {
        this.tipoContato = tipoContato;
    }
}
