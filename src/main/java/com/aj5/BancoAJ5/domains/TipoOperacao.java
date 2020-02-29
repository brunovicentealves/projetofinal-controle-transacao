package com.aj5.BancoAJ5.domains;

import java.util.List;

public class TipoOperacao {

    private Long idTipoOperacao;
    private String codTipoOperacao;
    private String nomeTipoOpercacao;
    private List<Taxa> taxaList;

    public TipoOperacao() {
    }

    public TipoOperacao(Long idTipoOperacao, String codTipoOperacao, String nomeTipoOpercacao, List<Taxa> taxaList) {
        this.idTipoOperacao = idTipoOperacao;
        this.codTipoOperacao = codTipoOperacao;
        this.nomeTipoOpercacao = nomeTipoOpercacao;
        this.taxaList = taxaList;
    }

    public Long getIdTipoOperacao() {
        return idTipoOperacao;
    }

    public String getCodTipoOperacao() {
        return codTipoOperacao;
    }

    public void setCodTipoOperacao(String codTipoOperacao) {
        this.codTipoOperacao = codTipoOperacao;
    }

    public String getNomeTipoOpercacao() {
        return nomeTipoOpercacao;
    }

    public void setNomeTipoOpercacao(String nomeTipoOpercacao) {
        this.nomeTipoOpercacao = nomeTipoOpercacao;
    }

    public List<Taxa> getTaxaList() {
        return taxaList;
    }

    public void setTaxaList(List<Taxa> taxaList) {
        this.taxaList = taxaList;
    }

    @Override
    public String toString() {
        return "TipoOperacao{" +
                "idTipoOperacao=" + idTipoOperacao +
                ", codTipoOperacao='" + codTipoOperacao + '\'' +
                ", nomeTipoOpercacao='" + nomeTipoOpercacao + '\'' +
                ", taxaList=" + taxaList +
                '}';
    }
}
