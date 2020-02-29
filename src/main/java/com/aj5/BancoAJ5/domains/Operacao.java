package com.aj5.BancoAJ5.domains;

import java.util.Date;

public class Operacao {

    private Long idOperacao;
    private Long idTipoOperacao;
    private Long idCanalOperacao;
    private Long idContaOrigem;
    private Long idContaDestino;
    private Date data;
    private String descricao;
    private Double valor;

    public Operacao() {
    }

    public Operacao(Long idOperacao, Long idTipoOperacao, Long idCanalOperacao, Long idContaOrigem, Long idContaDestino, Date data, String descricao, Double valor) {
        this.idOperacao = idOperacao;
        this.idTipoOperacao = idTipoOperacao;
        this.idCanalOperacao = idCanalOperacao;
        this.idContaOrigem = idContaOrigem;
        this.idContaDestino = idContaDestino;
        this.data = data;
        this.descricao = descricao;
        this.valor = valor;
    }

    public Long getIdOperacao() {
        return idOperacao;
    }
    public Long getIdTipoOperacao() {
        return idTipoOperacao;
    }

    public void setIdTipoOperacao(Long idTipoOperacao) {
        this.idTipoOperacao = idTipoOperacao;
    }

    public Long getIdCanalOperacao() {
        return idCanalOperacao;
    }

    public void setIdCanalOperacao(Long idCanalOperacao) {
        this.idCanalOperacao = idCanalOperacao;
    }

    public Long getIdContaOrigem() {
        return idContaOrigem;
    }

    public void setIdContaOrigem(Long idContaOrigem) {
        this.idContaOrigem = idContaOrigem;
    }

    public Long getIdContaDestino() {
        return idContaDestino;
    }

    public void setIdContaDestino(Long idContaDestino) {
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

    @Override
    public String toString() {
        return "Operacao{" +
                "idOperacao=" + idOperacao +
                ", idTipoOperacao=" + idTipoOperacao +
                ", idCanalOperacao=" + idCanalOperacao +
                ", idContaOrigem=" + idContaOrigem +
                ", idContaDestino=" + idContaDestino +
                ", data=" + data +
                ", descricao='" + descricao + '\'' +
                ", valor=" + valor +
                '}';
    }
}
