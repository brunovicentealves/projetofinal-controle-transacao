package com.aj5.BancoAJ5.domains;

import javax.persistence.*;
import java.util.List;
@Entity
@Table(name = "endereco")
public class Endereco {
    @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idEndereco;
    private String nomeEndereco;
    private int  numeroEndereco;
    private long cep;
    private String complemento;
    @ManyToOne
   @JoinColumn(name = "id_cidade", nullable = false)
    private Cidade cidade;

    @OneToMany(mappedBy = "endereco")
    List<Contato> contatoList;

    public Endereco() {
    }

    public Endereco(String nomeEndereco, int numeroEndereco, long cep, String complemento, Cidade cidade) {
        this.nomeEndereco = nomeEndereco;
        this.numeroEndereco = numeroEndereco;
        this.cep = cep;
        this.complemento = complemento;
        this.cidade = cidade;
    }

    public Endereco(String nomeEndereco, int numeroEndereco, long cep, String complemento) {
        this.nomeEndereco = nomeEndereco;
        this.numeroEndereco = numeroEndereco;
        this.cep = cep;
        this.complemento = complemento;
    }

    public long getIdEndereco() {
        return idEndereco;
    }

    public String getNomeEndereco() {
        return nomeEndereco;
    }

    public void setNomeEndereco(String nomeEndereco) {
        this.nomeEndereco = nomeEndereco;
    }

    public int getNumeroEndereco() {
        return numeroEndereco;
    }

    public void setNumeroEndereco(int numeroEndereco) {
        this.numeroEndereco = numeroEndereco;
    }

    public long getCep() {
        return cep;
    }

    public void setCep(long cep) {
        this.cep = cep;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public Cidade getCidade() {
        return cidade;
    }

    public void setCidade(Cidade cidade) {
        this.cidade = cidade;
    }


}
