package com.aj5.BancoAJ5.domains;

import java.util.List;

public class LimiteCanal {

    private Long idLimiteCanal;
    private CanalOperacao idCanalOperacao;
    private String codLimiteCanal;
    private String nomeLimiteCanal;

    private List<LimiteCanalConta> limiteCanalList;

    public LimiteCanal() {
    }

    public LimiteCanal(Long idLimiteCanal, CanalOperacao idCanalOperacao, String codLimiteCanal, String nomeLimiteCanal) {
        this.idLimiteCanal = idLimiteCanal;
        this.idCanalOperacao = idCanalOperacao;
        this.codLimiteCanal = codLimiteCanal;
        this.nomeLimiteCanal = nomeLimiteCanal;
    }

    public Long getIdLimiteCanal() {
        return idLimiteCanal;
    }

    public CanalOperacao getIdCanalOperacao() {
        return idCanalOperacao;
    }

    public void setIdCanalOperacao(CanalOperacao idCanalOperacao) {
        this.idCanalOperacao = idCanalOperacao;
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

    @Override
    public String toString() {
        return "LimiteCanal{" +
                "idLimiteCanal=" + idLimiteCanal +
                ", idCanalOperacao=" + idCanalOperacao +
                ", codLimiteCanal='" + codLimiteCanal + '\'' +
                ", nomeLimiteCanal='" + nomeLimiteCanal + '\'' +
                '}';
    }
}
