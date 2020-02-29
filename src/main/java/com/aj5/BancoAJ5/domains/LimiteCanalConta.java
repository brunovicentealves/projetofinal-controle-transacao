package com.aj5.BancoAJ5.domains;

public class LimiteCanalConta {

    private Long idlimiteConta;
    private Long idConta;
    private Long idLimiteCanalConta;

    public LimiteCanalConta() {
    }

    public LimiteCanalConta(Long idlimiteConta, Long idConta, Long idLimiteCanalConta) {
        this.idlimiteConta = idlimiteConta;
        this.idConta = idConta;
        this.idLimiteCanalConta = idLimiteCanalConta;
    }

    public Long getIdlimiteConta() {
        return idlimiteConta;
    }

    public Long getIdConta() {
        return idConta;
    }

    public void setIdConta(Long idConta) {
        this.idConta = idConta;
    }

    public Long getIdLimiteCanalConta() {
        return idLimiteCanalConta;
    }

    public void setIdLimiteCanalConta(Long idLimiteCanalConta) {
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
