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


   // private List<Operacao> operacaoList;

    @OneToMany(mappedBy = "contaDestino")
   private List<Agendamento> agendamentoDestinoList;

    @OneToMany(mappedBy = "contaOrigem")
    private List<Agendamento> agendamentoOrigemList;


    public Conta() {
    }








}
