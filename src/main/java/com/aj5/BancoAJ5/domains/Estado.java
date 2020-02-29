package com.aj5.BancoAJ5.domains;

import javax.persistence.*;
import java.util.List;
@Entity
@Table(name = "estado")
public class Estado {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY )
    private long idEstado;
    private String nomeEstado;
    private String sigla;
    @OneToMany(mappedBy = "estado")
    private List<Cidade> cidadeList;

    public Estado() {
    }

    public Estado(String nomeEstado, String sigla) {
        this.nomeEstado = nomeEstado;
        this.sigla = sigla;
    }

    public long getIdEstado() {
        return idEstado;
    }

    public String getNomeEstado() {
        return nomeEstado;
    }

    public void setNomeEstado(String nomeEstado) {
        this.nomeEstado = nomeEstado;
    }

    public String getSigla() {
        return sigla;
    }

    public void setSigla(String sigla) {
        this.sigla = sigla;
    }


    public List<Cidade> getCidadeList() {
        return cidadeList;
    }

    public void setCidadeList(List<Cidade> cidadeList) {
        this.cidadeList = cidadeList;
    }
}
