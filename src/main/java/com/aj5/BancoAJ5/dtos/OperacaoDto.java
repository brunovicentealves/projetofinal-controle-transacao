package com.aj5.BancoAJ5.dtos;

import java.util.Date;

public class OperacaoDto {

    private long idTipoOperacao;
    private long idCanalOperacao;
    private  long idContaOrigem;
    private long idContaDestino;
    private Date data;
    private String descricao;
    private Double valor;


    public OperacaoDto(long idTipoOperacao, long idCanalOperacao, long idContaOrigem, long idContaDestino, Date data, String descricao, Double valor) {
        this.idTipoOperacao = idTipoOperacao;
        this.idCanalOperacao = idCanalOperacao;
        this.idContaOrigem = idContaOrigem;
        this.idContaDestino = idContaDestino;
        this.data = data;
        this.descricao = descricao;
        this.valor = valor;
    }

    public long getIdTipoOperacao() {
        return idTipoOperacao;
    }

    public void setIdTipoOperacao(long idTipoOperacao) {
        this.idTipoOperacao = idTipoOperacao;
    }

    public long getIdCanalOperacao() {
        return idCanalOperacao;
    }

    public void setIdCanalOperacao(long idCanalOperacao) {
        this.idCanalOperacao = idCanalOperacao;
    }

    public long getIdContaOrigem() {
        return idContaOrigem;
    }

    public void setIdContaOrigem(long idContaOrigem) {
        this.idContaOrigem = idContaOrigem;
    }

    public long getIdContaDestino() {
        return idContaDestino;
    }

    public void setIdContaDestino(long idContaDestino) {
        this.idContaDestino = idContaDestino;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }
}
