package com.aj5.BancoAJ5.dtos;

import java.util.Date;

public class PessoaFisicaDto {

    private String nomePessoa;
    private Date  dataNAscimento;
    private String cpf;
    private double  rendaMensal;
    private long idConta;

    public PessoaFisicaDto(String nomePessoa, Date dataNAscimento, String cpf, double rendaMensal, long idConta) {
        this.nomePessoa = nomePessoa;
        this.dataNAscimento = dataNAscimento;
        this.cpf = cpf;
        this.rendaMensal = rendaMensal;
        this.idConta = idConta;
    }

    public String getNomePessoa() {
        return nomePessoa;
    }

    public void setNomePessoa(String nomePessoa) {
        this.nomePessoa = nomePessoa;
    }

    public Date getDataNAscimento() {
        return dataNAscimento;
    }

    public void setDataNAscimento(Date dataNAscimento) {
        this.dataNAscimento = dataNAscimento;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public double getRendaMensal() {
        return rendaMensal;
    }

    public void setRendaMensal(double rendaMensal) {
        this.rendaMensal = rendaMensal;
    }

    public long getIdConta() {
        return idConta;
    }

    public void setIdConta(long idConta) {
        this.idConta = idConta;
    }
}
