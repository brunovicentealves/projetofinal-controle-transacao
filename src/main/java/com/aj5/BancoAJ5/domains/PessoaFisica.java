package com.aj5.BancoAJ5.domains;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.List;
@Entity
@Table(name = "pessoa_fisica")
public class PessoaFisica implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idPessoaFisica;

    private String nomePessoa;
    private Date dataNascimento;
    private String cpf;
    private Double rendaMensal;


    @OneToMany(mappedBy = "pessoaFisica")
    private List<PessoaFisicaContato> pessoaFisicaContatoList;
    @OneToOne
    @JoinColumn(name = "id_conta")
    private Conta conta;


    public PessoaFisica(String nomePessoa, Date dataNascimento, String cpf, Double rendaMensal, List<PessoaFisicaContato> pessoaFisicaContatoList, Conta conta) {
        this.nomePessoa = nomePessoa;
        this.dataNascimento = dataNascimento;
        this.cpf = cpf;
        this.rendaMensal = rendaMensal;
        this.pessoaFisicaContatoList = pessoaFisicaContatoList;
        this.conta = conta;
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

    public List<PessoaFisicaContato> getPessoaFisicaContatoList() {
        return pessoaFisicaContatoList;
    }

    public void setPessoaFisicaContatoList(List<PessoaFisicaContato> pessoaFisicaContatoList) {
        this.pessoaFisicaContatoList = pessoaFisicaContatoList;
    }

    public Conta getConta() {
        return conta;
    }

    public void setConta(Conta conta) {
        this.conta = conta;
    }
}
