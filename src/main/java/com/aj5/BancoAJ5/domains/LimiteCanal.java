package com.aj5.BancoAJ5.domains;

import javax.persistence.*;
import java.util.List;
@Entity
@Table(name = "limite_canal")
public class LimiteCanal {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idLimiteCanal;

    //private CanalOperacao idCanalOperacao;
    private String codLimiteCanal;
    private String nomeLimiteCanal;

    @OneToMany(mappedBy = "limiteCanal")
    private List<LimiteCanalConta> limiteCanalList;

    public LimiteCanal() {
    }


}
