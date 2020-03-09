package com.aj5.BancoAJ5.domains;

import javax.persistence.*;

@Entity
@Table(name = "limite_canal_Conta")
public class LimiteCanalConta {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idlimiteConta;

    @ManyToOne
    @JoinColumn(name = "id_conta", nullable = false)
    private Conta conta;

    @ManyToOne
    @JoinColumn(name = "id_limite_conta",nullable = false)
    private LimiteCanal limiteCanal;


    public LimiteCanalConta(Conta conta, LimiteCanal limiteCanal) {
        this.conta = conta;
        this.limiteCanal = limiteCanal;
    }

    public LimiteCanalConta() {
    }

    public Conta getConta() {
        return conta;
    }

    public void setConta(Conta conta) {
        this.conta = conta;
    }

    public LimiteCanal getLimiteCanal() {
        return limiteCanal;
    }

    public void setLimiteCanal(LimiteCanal limiteCanal) {
        this.limiteCanal = limiteCanal;
    }
}
