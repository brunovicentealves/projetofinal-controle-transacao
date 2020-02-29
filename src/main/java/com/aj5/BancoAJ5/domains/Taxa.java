package com.aj5.BancoAJ5.domains;

import java.util.Date;

public class Taxa {

    private Long idTaxa;
    private Long idOperacao;
    private Long idTipoOperacao;
    private String nomeTaxa;
    private Double valor;
    private String codTaxa;
    private Date dataInicio;
    private Date dataFim;

    public Taxa() {
    }

    public Taxa(Long idTaxa, Long idOperacao, Long idTipoOperacao, String nomeTaxa, Double valor, String codTaxa, Date dataInicio, Date dataFim) {
        this.idTaxa = idTaxa;
        this.idOperacao = idOperacao;
        this.idTipoOperacao = idTipoOperacao;
        this.nomeTaxa = nomeTaxa;
        this.valor = valor;
        this.codTaxa = codTaxa;
        this.dataInicio = dataInicio;
        this.dataFim = dataFim;
    }

    public Long getIdTaxa() {
        return idTaxa;
    }

    public Long getIdOperacao() {
        return idOperacao;
    }

    public void setIdOperacao(Long idOperacao) {
        this.idOperacao = idOperacao;
    }

    public Long getIdTipoOperacao() {
        return idTipoOperacao;
    }

    public void setIdTipoOperacao(Long idTipoOperacao) {
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

    @Override
    public String toString() {
        return "Taxa{" +
                "idTaxa=" + idTaxa +
                ", idOperacao=" + idOperacao +
                ", idTipoOperacao=" + idTipoOperacao +
                ", nomeTaxa='" + nomeTaxa + '\'' +
                ", valor=" + valor +
                ", codTaxa='" + codTaxa + '\'' +
                ", dataInicio=" + dataInicio +
                ", dataFim=" + dataFim +
                '}';
    }
}
