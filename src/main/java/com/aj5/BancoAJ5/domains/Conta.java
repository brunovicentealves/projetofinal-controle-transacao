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

    @OneToOne(mappedBy = "conta")
    private PessoaFisica pessoaFisica;
    @OneToOne(mappedBy ="conta")
    private PessoaJuridica pessoaJuridica;

    @OneToMany(mappedBy = "conta")
     private List<LimiteCanalConta> limiteCanalConta;

    @OneToMany(mappedBy = "contaOrigem")
    private List<Operacao> operacaoOrigemList;

    @OneToMany(mappedBy = "contaDestino")
    private List<Operacao> operacaoDestinoList;

    @OneToMany(mappedBy = "contaDestino")
   private List<Agendamento> agendamentoDestinoList;

    @OneToMany(mappedBy = "contaOrigem")
    private List<Agendamento> agendamentoOrigemList;




    public Conta() {
    }


    public Conta(long numeroConta, Date dataAbertura, String senha, Double saldo, Double limiteCheckEspecial, String userName, Agencia agencia, TaxaConta taxaConta, PessoaFisica pessoaFisica, PessoaJuridica pessoaJuridica, List<LimiteCanalConta> limiteCanalConta, List<Operacao> operacaoOrigemList, List<Operacao> operacaoDestinoList, List<Agendamento> agendamentoDestinoList, List<Agendamento> agendamentoOrigemList) {
        this.numeroConta = numeroConta;
        this.dataAbertura = dataAbertura;
        this.senha = senha;
        this.saldo = saldo;
        this.limiteCheckEspecial = limiteCheckEspecial;
        this.userName = userName;
        this.agencia = agencia;
        this.taxaConta = taxaConta;
        this.pessoaFisica = pessoaFisica;
        this.pessoaJuridica = pessoaJuridica;
        this.limiteCanalConta = limiteCanalConta;
        this.operacaoOrigemList = operacaoOrigemList;
        this.operacaoDestinoList = operacaoDestinoList;
        this.agendamentoDestinoList = agendamentoDestinoList;
        this.agendamentoOrigemList = agendamentoOrigemList;
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

    public Agencia getAgencia() {
        return agencia;
    }

    public void setAgencia(Agencia agencia) {
        this.agencia = agencia;
    }

    public TaxaConta getTaxaConta() {
        return taxaConta;
    }

    public void setTaxaConta(TaxaConta taxaConta) {
        this.taxaConta = taxaConta;
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

    public List<LimiteCanalConta> getLimiteCanalConta() {
        return limiteCanalConta;
    }

    public void setLimiteCanalConta(List<LimiteCanalConta> limiteCanalConta) {
        this.limiteCanalConta = limiteCanalConta;
    }

    public List<Agendamento> getAgendamentoDestinoList() {
        return agendamentoDestinoList;
    }

    public void setAgendamentoDestinoList(List<Agendamento> agendamentoDestinoList) {
        this.agendamentoDestinoList = agendamentoDestinoList;
    }

    public List<Agendamento> getAgendamentoOrigemList() {
        return agendamentoOrigemList;
    }

    public void setAgendamentoOrigemList(List<Agendamento> agendamentoOrigemList) {
        this.agendamentoOrigemList = agendamentoOrigemList;
    }

    public List<Operacao> getOperacaoOrigemList() {
        return operacaoOrigemList;
    }

    public void setOperacaoOrigemList(List<Operacao> operacaoOrigemList) {
        this.operacaoOrigemList = operacaoOrigemList;
    }

    public List<Operacao> getOperacaoDestinoList() {
        return operacaoDestinoList;
    }

    public void setOperacaoDestinoList(List<Operacao> operacaoDestinoList) {
        this.operacaoDestinoList = operacaoDestinoList;
    }
}
