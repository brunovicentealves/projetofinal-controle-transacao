package com.aj5.BancoAJ5.domains;

import javax.persistence.*;
import java.util.Date;
import java.util.List;
@Entity
@Table(name = "conta")
public class Conta {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idConta;
    @OneToOne(mappedBy = "conta")
    private PessoaFisica pessoaFisica;
    @OneToOne(mappedBy ="conta")
    private PessoaJuridica pessoaJuridica;
    private long numeroConta;
    private Date dataAbertura;
    private String senha;
    private Double saldo;
    private Double limiteCheckEspecial;
    private String userName;
    @ManyToOne
    @JoinColumn(name ="id_agencia", nullable = false)
    private Agencia agencia;

    @ManyToOne
    @JoinColumn(name = "id_taxa_conta",nullable = false)
    private TaxaConta taxaConta;

   // private List<TaxaConta> taxaContaList;
   // private List<Operacao> operacaoList;
   // private List<Agendamento> agendamentoList;

    public Conta() {
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
}
