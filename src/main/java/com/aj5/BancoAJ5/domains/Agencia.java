package com.aj5.BancoAJ5.domains;

import javax.persistence.*;
import java.util.List;
@Entity
@Table(name = "agencia")
public class  Agencia {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idAgencia;
    private String nomeAgencia;


    @OneToMany(mappedBy = "agencia")
    private List<Conta> contaList;

    public Agencia() {
    }

    public Agencia(Long idAgencia, String nomeAgencia) {
        this.idAgencia = idAgencia;
        this.nomeAgencia = nomeAgencia;
    }

    public Agencia (String nomeAgencia) {
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


}
