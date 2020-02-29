package com.aj5.BancoAJ5.domains;

public class LimiteCanalConta {

    private Long idlimiteConta;
    private Conta idConta;
    private LimiteCanal idLimiteCanalConta;

    public LimiteCanalConta() {
    }

    public LimiteCanalConta(Long idlimiteConta, Conta idConta, LimiteCanal idLimiteCanalConta) {
        this.idlimiteConta = idlimiteConta;
        this.idConta = idConta;
        this.idLimiteCanalConta = idLimiteCanalConta;
    }

    public Long getIdlimiteConta() {
        return idlimiteConta;
    }

    public Conta getIdConta() {
        return idConta;
    }

    public void setIdConta(Conta idConta) {
        this.idConta = idConta;
    }

    public LimiteCanal getIdLimiteCanalConta() {
        return idLimiteCanalConta;
    }

    public void setIdLimiteCanalConta(LimiteCanal idLimiteCanalConta) {
        this.idLimiteCanalConta = idLimiteCanalConta;
    }

    @Override
    public String toString() {
        return "LimiteCanalConta{" +
                "idlimiteConta=" + idlimiteConta +
                ", idConta=" + idConta +
                ", idLimiteCanalConta=" + idLimiteCanalConta +
                '}';
    }
}
