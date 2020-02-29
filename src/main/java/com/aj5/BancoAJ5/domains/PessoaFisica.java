package com.aj5.BancoAJ5.domains;

import java.util.Date;
import java.util.List;

public class PessoaFisica {
    private long idPessoaFisica;
    private List<PessoaFisicaContato> pessoaFisicaContatoList;
    private String nomePessoa;
    private Date dataNascimento;
    private String cpf;
    private Double rendaMensal;
    private Conta conta;

    public PessoaFisica(List<PessoaFisicaContato> pessoaFisicaContatoList, String nomePessoa, Date dataNascimento, String cpf, Double rendaMensal, Conta conta) {
        this.pessoaFisicaContatoList = pessoaFisicaContatoList;
        this.nomePessoa = nomePessoa;
        this.dataNascimento = dataNascimento;
        this.cpf = cpf;
        this.rendaMensal = rendaMensal;
        this.conta = conta;
    }

    public List<PessoaFisicaContato> getPessoaFisicaContatoList() {
        return pessoaFisicaContatoList;
    }

    public void setPessoaFisicaContatoList(List<PessoaFisicaContato> pessoaFisicaContatoList) {
        this.pessoaFisicaContatoList = pessoaFisicaContatoList;
    }

    public String getNomePessoa() {
        return nomePessoa;
    }

    public void setNomePessoa(String nomePessoa) {
        this.nomePessoa = nomePessoa;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Double getRendaMensal() {
        return rendaMensal;
    }

    public void setRendaMensal(Double rendaMensal) {
        this.rendaMensal = rendaMensal;
    }

    public Conta getConta() {
        return conta;
    }

    public void setConta(Conta conta) {
        this.conta = conta;
    }
}
