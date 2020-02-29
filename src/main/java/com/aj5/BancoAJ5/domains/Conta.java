package com.aj5.BancoAJ5.domains;

import java.util.Date;
import java.util.List;

public class Conta {
    private long idConta;
    private PessoaFisica pessoaFisica;
    private PessoaJuridica pessoaJuridica;
    private long numeroConta;
    private Date dataAbertura;
    private String senha;
    private Double saldo;
    private Double limiteCheckEspecial;
    private String userName;
    private Agencia agencia;
    private List<TaxaConta> taxaContaList;
    private List<Operacao> operacaoList;
    private List<Agendamento> agendamentoList;

    public Conta() {
    }

    public Conta(Agencia agencia, PessoaFisica pessoaFisica, PessoaJuridica pessoaJuridica, List<TaxaConta> taxaContaList, long numeroConta, Date dataAbertura, String senha, Double saldo, Double limiteCheckEspecial, String userName) {
        this.agencia = agencia;
        this.pessoaFisica = pessoaFisica;
        this.pessoaJuridica = pessoaJuridica;
        this.taxaContaList = taxaContaList;
        this.numeroConta = numeroConta;
        this.dataAbertura = dataAbertura;
        this.senha = senha;
        this.saldo = saldo;
        this.limiteCheckEspecial = limiteCheckEspecial;
        this.userName = userName;
    }

    public Agencia getAgencia() {
        return agencia;
    }

    public void setAgencia(Agencia agencia) {
        this.agencia = agencia;
    }

    public PessoaFisica getPessoaFisica() {
        return pessoaFisica;
    }

    public void setPessoaFisica(PessoaFisica pessoaFisica) {
        this.pessoaFisica = pessoaFisica;
    }

    public PessoaJuridica getPessoaJuridica() {
        return pessoaJuridica;
    }

    public void setPessoaJuridica(PessoaJuridica pessoaJuridica) {
        this.pessoaJuridica = pessoaJuridica;
    }

    public List<TaxaConta> getTaxaContaList() {
        return taxaContaList;
    }

    public void setTaxaContaList(List<TaxaConta> taxaContaList) {
        this.taxaContaList = taxaContaList;
    }

    public long getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(long numeroConta) {
        this.numeroConta = numeroConta;
    }

    public Date getDataAbertura() {
        return dataAbertura;
    }

    public void setDataAbertura(Date dataAbertura) {
        this.dataAbertura = dataAbertura;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    public Double getLimiteCheckEspecial() {
        return limiteCheckEspecial;
    }

    public void setLimiteCheckEspecial(Double limiteCheckEspecial) {
        this.limiteCheckEspecial = limiteCheckEspecial;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }


    public List<Operacao> getOperacaoList() {
        return operacaoList;
    }

    public void setOperacaoList(List<Operacao> operacaoList) {
        this.operacaoList = operacaoList;
    }

    public List<Agendamento> getAgendamentoList() {
        return agendamentoList;
    }

    public void setAgendamentoList(List<Agendamento> agendamentoList) {
        this.agendamentoList = agendamentoList;
    }
}
