package com.aj5.BancoAJ5.domains;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.List;

public class Agencia {

    private Long idAgencia;
    private String nomeAgencia;
    private List<Conta> contas;

    public Agencia() {
    }

    public Agencia(Long idAgencia, String nomeAgencia) {
        this.idAgencia = idAgencia;
        this.nomeAgencia = nomeAgencia;
    }

    public Long getIdAgencia() {
        return idAgencia;
    }
    public String getNomeAgencia() {
        return nomeAgencia;
    }

    public void setNomeAgencia(String nomeAgencia) {
        this.nomeAgencia = nomeAgencia;
    }

    @Override
    public String toString() {
        return "Agencia{" +
                "idAgencia=" + idAgencia +
                ", nomeAgencia='" + nomeAgencia + '\'' +
                '}';
    }
}
