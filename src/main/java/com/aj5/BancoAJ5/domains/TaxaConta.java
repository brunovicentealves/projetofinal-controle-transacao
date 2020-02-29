package com.aj5.BancoAJ5.domains;

public class TaxaConta {

    private Long idTaxaConta;
    private Long idConta;
    private Long idTaxa;

    public TaxaConta() {
    }

    public TaxaConta(Long idTaxaConta, Long idConta, Long idTaxa) {
        this.idTaxaConta = idTaxaConta;
        this.idConta = idConta;
        this.idTaxa = idTaxa;
    }

    public Long getIdTaxaConta() {
        return idTaxaConta;
    }

    public Long getIdConta() {
        return idConta;
    }

    public void setIdConta(Long idConta) {
        this.idConta = idConta;
    }

    public Long getIdTaxa() {
        return idTaxa;
    }

    public void setIdTaxa(Long idTaxa) {
        this.idTaxa = idTaxa;
    }

    @Override
    public String toString() {
        return "TaxaConta{" +
                "idTaxaConta=" + idTaxaConta +
                ", idConta=" + idConta +
                ", idTaxa=" + idTaxa +
                '}';
    }
}
