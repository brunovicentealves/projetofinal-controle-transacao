package com.aj5.BancoAJ5.domains;

public class TaxaConta {

    private Long idTaxaConta;
    private Conta idConta;
    private Taxa idTaxa;

    public TaxaConta() {
    }

    public TaxaConta(Long idTaxaConta, Conta idConta, Taxa idTaxa) {
        this.idTaxaConta = idTaxaConta;
        this.idConta = idConta;
        this.idTaxa = idTaxa;
    }

    public Long getIdTaxaConta() {
        return idTaxaConta;
    }

    public Conta getIdConta() {
        return idConta;
    }

    public void setIdConta(Conta idConta) {
        this.idConta = idConta;
    }

    public Taxa getIdTaxa() {
        return idTaxa;
    }

    public void setIdTaxa(Taxa idTaxa) {
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
