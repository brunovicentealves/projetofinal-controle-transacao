package com.aj5.BancoAJ5.domains;

public class LimiteCanal {

    private Long idLimiteCanal;
    private Long idCanalOperacao;
    private String codLimiteCanal;
    private String nomeLimiteCanal;

    public LimiteCanal() {
    }

    public LimiteCanal(Long idLimiteCanal, Long idCanalOperacao, String codLimiteCanal, String nomeLimiteCanal) {
        this.idLimiteCanal = idLimiteCanal;
        this.idCanalOperacao = idCanalOperacao;
        this.codLimiteCanal = codLimiteCanal;
        this.nomeLimiteCanal = nomeLimiteCanal;
    }

    public Long getIdLimiteCanal() {
        return idLimiteCanal;
    }

    public Long getIdCanalOperacao() {
        return idCanalOperacao;
    }

    public void setIdCanalOperacao(Long idCanalOperacao) {
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
