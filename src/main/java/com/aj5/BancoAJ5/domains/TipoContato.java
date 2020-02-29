package com.aj5.BancoAJ5.domains;

import java.util.List;

public class TipoContato {
    private long idTipoContato;
    private String descricao;

    List<Contato> contatoslist;

    public TipoContato() {
    }

    public TipoContato(String descricao) {
        this.descricao = descricao;
    }


    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public List<Contato> getContatoslist() {
        return contatoslist;
    }

    public void setContatoslist(List<Contato> contatoslist) {
        this.contatoslist = contatoslist;
    }
}
