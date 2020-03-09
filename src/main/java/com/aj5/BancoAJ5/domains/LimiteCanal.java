package com.aj5.BancoAJ5.domains;

import javax.persistence.*;
import java.util.List;
@Entity
@Table(name = "limite_canal")
public class LimiteCanal {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idLimiteCanal;
    private String codLimiteCanal;
    private String nomeLimiteCanal;

    @OneToMany(mappedBy = "limiteCanal")
    private List<LimiteCanalConta> limiteCanalList;

    @ManyToOne
    @JoinColumn(name = "id_canal_operacao",nullable = false)
    private CanalOperacao canalOperacao;

    public LimiteCanal() {
    }

    public LimiteCanal(CanalOperacao canalOperacao, String codLimiteCanal, String nomeLimiteCanal, List<LimiteCanalConta> limiteCanalList) {
        this.canalOperacao = canalOperacao;
        this.codLimiteCanal = codLimiteCanal;
        this.nomeLimiteCanal = nomeLimiteCanal;
        this.limiteCanalList = limiteCanalList;
    }

    public CanalOperacao getCanalOperacao() {
        return canalOperacao;
    }

    public void setCanalOperacao(CanalOperacao canalOperacao) {
        this.canalOperacao = canalOperacao;
    }

    public String getCodLimiteCanal() {
        return codLimiteCanal;
    }

    public void setCodLimiteCanal(String codLimiteCanal) {
        this.codLimiteCanal = codLimiteCanal;
    }

    public String getNomeLimiteCanal() {
        return nomeLimiteCanal;
    }

    public void setNomeLimiteCanal(String nomeLimiteCanal) {
        this.nomeLimiteCanal = nomeLimiteCanal;
    }

    public List<LimiteCanalConta> getLimiteCanalList() {
        return limiteCanalList;
    }

    public void setLimiteCanalList(List<LimiteCanalConta> limiteCanalList) {
        this.limiteCanalList = limiteCanalList;
    }
}
