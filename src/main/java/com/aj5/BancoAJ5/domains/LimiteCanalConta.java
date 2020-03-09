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


}
