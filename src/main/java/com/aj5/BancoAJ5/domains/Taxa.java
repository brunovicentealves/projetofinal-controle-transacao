package com.aj5.BancoAJ5.domains;

import javax.persistence.*;
import java.util.Date;
import java.util.List;
@Entity
@Table(name = "taxa")
public class Taxa {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idTaxa;
    private String nomeTaxa;
    private Double valor;
    private String codTaxa;
    private Date dataInicio;
    private Date dataFim;
    private String valorTaxa;



    @OneToMany(mappedBy = "taxa")
   private List<TaxaConta> taxaContaList;

    @ManyToOne
    @JoinColumn(name = "id_tipo_operacao", nullable = false)
    private TipoOperacao tipoOperacao;

    public Taxa() {
    }



    public Long getIdTaxa() {
        return idTaxa;
    }

    public void setIdTaxa(Long idTaxa) {
        this.idTaxa = idTaxa;
    }

    public List<TaxaConta> getTaxaContaList() {
        return taxaContaList;
    }

    public void setTaxaContaList(List<TaxaConta> taxaContaList) {
        this.taxaContaList = taxaContaList;
    }

    public TipoOperacao getTipoOperacao() {
        return tipoOperacao;
    }

    public void setTipoOperacao(TipoOperacao tipoOperacao) {
        this.tipoOperacao = tipoOperacao;
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




}
