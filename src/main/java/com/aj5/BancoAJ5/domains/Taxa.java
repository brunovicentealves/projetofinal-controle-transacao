package com.aj5.BancoAJ5.domains;

import java.util.Date;
import java.util.List;

public class Taxa {

    private Long idTaxa;
    private TipoOperacao idTipoOperacao;
    private String nomeTaxa;
    private Double valor;
    private String codTaxa;
    private Date dataInicio;
    private Date dataFim;
    private String valorTaxa;
    private List<TaxaConta> taxaContaList;

    public Taxa() {
    }

    public Taxa(Long idTaxa, TipoOperacao idTipoOperacao, String nomeTaxa, Double valor, String codTaxa, Date dataInicio, Date dataFim, String valorTaxa, List<TaxaConta> taxaContaList) {
        this.idTaxa = idTaxa;
        this.idTipoOperacao = idTipoOperacao;
        this.nomeTaxa = nomeTaxa;
        this.valor = valor;
        this.codTaxa = codTaxa;
        this.dataInicio = dataInicio;
        this.dataFim = dataFim;
        this.valorTaxa = valorTaxa;
        this.taxaContaList = taxaContaList;
    }

    public Long getIdTaxa() {
        return idTaxa;
    }

    public void setIdTaxa(Long idTaxa) {
        this.idTaxa = idTaxa;
    }

    public TipoOperacao getIdTipoOperacao() {
        return idTipoOperacao;
    }

    public void setIdTipoOperacao(TipoOperacao idTipoOperacao) {
        this.idTipoOperacao = idTipoOperacao;
    }

    public String getNomeTaxa() {
        return nomeTaxa;
    }

    public void setNomeTaxa(String nomeTaxa) {
        this.nomeTaxa = nomeTaxa;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public String getCodTaxa() {
        return codTaxa;
    }

    public void setCodTaxa(String codTaxa) {
        this.codTaxa = codTaxa;
    }

    public Date getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(Date dataInicio) {
        this.dataInicio = dataInicio;
    }

    public Date getDataFim() {
        return dataFim;
    }

    public void setDataFim(Date dataFim) {
        this.dataFim = dataFim;
    }

    public String getValorTaxa() {
        return valorTaxa;
    }

    public void setValorTaxa(String valorTaxa) {
        this.valorTaxa = valorTaxa;
    }

    public List<TaxaConta> getTaxaContaList() {
        return taxaContaList;
    }

    public void setTaxaContaList(List<TaxaConta> taxaContaList) {
        this.taxaContaList = taxaContaList;
    }

    @Override
    public String toString() {
        return "Taxa{" +
                "idTaxa=" + idTaxa +
                ", idTipoOperacao=" + idTipoOperacao +
                ", nomeTaxa='" + nomeTaxa + '\'' +
                ", valor=" + valor +
                ", codTaxa='" + codTaxa + '\'' +
                ", dataInicio=" + dataInicio +
                ", dataFim=" + dataFim +
                ", valorTaxa='" + valorTaxa + '\'' +
                ", taxaContaList=" + taxaContaList +
                '}';
    }
}
