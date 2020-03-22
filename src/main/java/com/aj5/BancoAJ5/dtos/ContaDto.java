package com.aj5.BancoAJ5.dtos;

import java.util.Date;

public class ContaDto {

    private long numeroConta;
    private Date dataAbertura;
    private String senha;
    private Double saldo;
    private Double  limiteCheckEspecial;
    private String userName;
    private long idAgencia;
    private long idTaxaConta;


    public ContaDto(long numeroConta, Date dataAbertura, String senha, Double saldo, Double limiteCheckEspecial, String userName, long idAgencia, long idTaxaConta) {
        this.numeroConta = numeroConta;
        this.dataAbertura = dataAbertura;
        this.senha = senha;
        this.saldo = saldo;
        this.limiteCheckEspecial = limiteCheckEspecial;
        this.userName = userName;
        this.idAgencia = idAgencia;
        this.idTaxaConta = idTaxaConta;
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

    public long getIdAgencia() {
        return idAgencia;
    }

    public void setIdAgencia(long idAgencia) {
        this.idAgencia = idAgencia;
    }

    public long getIdTaxaConta() {
        return idTaxaConta;
    }

    public void setIdTaxaConta(long idTaxaConta) {
        this.idTaxaConta = idTaxaConta;
    }
}
