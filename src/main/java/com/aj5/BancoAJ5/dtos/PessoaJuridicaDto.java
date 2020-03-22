package com.aj5.BancoAJ5.dtos;

import java.util.Date;

public class PessoaJuridicaDto {

    private String nomeProprietario;
    private String CpfProprietario;
    private Double rendaMensal;
    private Date dataAbertura;
    private String cnpj;
    private double Faturamento;

    public PessoaJuridicaDto(String nomeProprietario, String cpfProprietario, Double rendaMensal, Date dataAbertura, String cnpj, double faturamento) {
        this.nomeProprietario = nomeProprietario;
        CpfProprietario = cpfProprietario;
        this.rendaMensal = rendaMensal;
        this.dataAbertura = dataAbertura;
        this.cnpj = cnpj;
        Faturamento = faturamento;
    }

    public String getNomeProprietario() {
        return nomeProprietario;
    }

    public void setNomeProprietario(String nomeProprietario) {
        this.nomeProprietario = nomeProprietario;
    }

    public String getCpfProprietario() {
        return CpfProprietario;
    }

    public void setCpfProprietario(String cpfProprietario) {
        CpfProprietario = cpfProprietario;
    }

    public Double getRendaMensal() {
        return rendaMensal;
    }

    public void setRendaMensal(Double rendaMensal) {
        this.rendaMensal = rendaMensal;
    }

    public Date getDataAbertura() {
        return dataAbertura;
    }

    public void setDataAbertura(Date dataAbertura) {
        this.dataAbertura = dataAbertura;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public double getFaturamento() {
        return Faturamento;
    }

    public void setFaturamento(double faturamento) {
        Faturamento = faturamento;
    }
}
