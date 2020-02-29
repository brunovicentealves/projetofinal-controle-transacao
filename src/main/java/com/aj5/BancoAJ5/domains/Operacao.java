package com.aj5.BancoAJ5.domains;

import java.util.Date;
import java.util.List;

public class Operacao {

    private Long idOperacao;
    private TipoOperacao idTipoOperacao;
    private CanalOperacao idCanalOperacao;
    private Long idContaOrigem;
    private Long idContaDestino;
    private Date data;
    private String descricao;
    private Double valor;
    private List<TipoOperacao> tipoOperacaoList;

    public Operacao() {
    }

    public Operacao(Long idOperacao, TipoOperacao idTipoOperacao, CanalOperacao idCanalOperacao, Long idContaOrigem, Long idContaDestino, Date data, String descricao, Double valor, List<TipoOperacao> tipoOperacaoList) {
        this.idOperacao = idOperacao;
        this.idTipoOperacao = idTipoOperacao;
        this.idCanalOperacao = idCanalOperacao;
        this.idContaOrigem = idContaOrigem;
        this.idContaDestino = idContaDestino;
        this.data = data;
        this.descricao = descricao;
        this.valor = valor;
        this.tipoOperacaoList = tipoOperacaoList;
    }

    public Long getIdOperacao() {
        return idOperacao;
    }

    public TipoOperacao getIdTipoOperacao() {
        return idTipoOperacao;
    }

    public void setIdTipoOperacao(TipoOperacao idTipoOperacao) {
        this.idTipoOperacao = idTipoOperacao;
    }

    public CanalOperacao getIdCanalOperacao() {
        return idCanalOperacao;
    }

    public void setIdCanalOperacao(CanalOperacao idCanalOperacao) {
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

    public List<TipoOperacao> getTipoOperacaoList() {
        return tipoOperacaoList;
    }

    public void setTipoOperacaoList(List<TipoOperacao> tipoOperacaoList) {
        this.tipoOperacaoList = tipoOperacaoList;
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
                ", tipoOperacaoList=" + tipoOperacaoList +
                '}';
    }
}
