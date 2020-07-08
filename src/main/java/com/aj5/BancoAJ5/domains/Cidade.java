package com.aj5.BancoAJ5.domains;

import javax.persistence.*;
import java.util.List;
@Entity
@Table(name = "cidade")
public class Cidade {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idCidade;
    private String nomeCidade;
    @ManyToOne
    @JoinColumn(name = "id_estado",nullable = false)
    private Estado estado;

    @OneToMany(mappedBy = "cidade")
    private List<Endereco> enderecoList;

    public Cidade() {
    }


    public Cidade(String nomeCidade, Estado estado) {
        this.nomeCidade = nomeCidade;
        this.estado = estado;
    }

    public Cidade(long idCidade, String nomeCidade) {
        this.idCidade = idCidade;
        this.nomeCidade = nomeCidade;
    }

    public long getIdCidade() {
        return idCidade;
    }


    public String getNomeCidade() {
        return nomeCidade;
    }

    public void setNomeCidade(String nomeCidade) {
        this.nomeCidade = nomeCidade;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;

    }


    public List<Endereco> getEnderecoList() {
        return enderecoList;
    }

    public void setEnderecoList(List<Endereco> enderecoList) {
        this.enderecoList = enderecoList;
    }
}

