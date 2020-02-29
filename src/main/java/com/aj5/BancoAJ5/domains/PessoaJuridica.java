package com.aj5.BancoAJ5.domains;

import java.util.Date;
import java.util.List;

public class PessoaJuridica {

    private long idPessoaJuridica;
    private String nomeProprietario;

    private String cpfProprietario;
    private Double rendaMensal;
    private Date dataAbertura;
    private String cnpj;
    private Double faturamento;


    private Conta conta;

    private List<PessoaJuridicaContato> pessoaJuridicaContatoList;


    public PessoaJuridica() {
    }

    public PessoaJuridica(String nomeProprietario, String cpfProprietario, Double rendaMensal, Date dataAbertura, String cnpj, Double faturamento, Conta conta, List<PessoaJuridicaContato> pessoaJuridicaContatoList) {
        this.nomeProprietario = nomeProprietario;
        this.cpfProprietario = cpfProprietario;
        this.rendaMensal = rendaMensal;
        this.dataAbertura = dataAbertura;
        this.cnpj = cnpj;
        this.faturamento = faturamento;
        this.conta = conta;
        this.pessoaJuridicaContatoList = pessoaJuridicaContatoList;
    }


    public String getNomeProprietario() {
        return nomeProprietario;
    }

    public void setNomeProprietario(String nomeProprietario) {
        this.nomeProprietario = nomeProprietario;
    }

    public String getCpfProprietario() {
        return cpfProprietario;
    }

    public void setCpfProprietario(String cpfProprietario) {
        this.cpfProprietario = cpfProprietario;
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

    public Double getFaturamento() {
        return faturamento;
    }

    public void setFaturamento(Double faturamento) {
        this.faturamento = faturamento;
    }

    public Conta getConta() {
        return conta;
    }

    public void setConta(Conta conta) {
        this.conta = conta;
    }

    public List<PessoaJuridicaContato> getPessoaJuridicaContatoList() {
        return pessoaJuridicaContatoList;
    }

    public void setPessoaJuridicaContatoList(List<PessoaJuridicaContato> pessoaJuridicaContatoList) {
        this.pessoaJuridicaContatoList = pessoaJuridicaContatoList;
    }
}
