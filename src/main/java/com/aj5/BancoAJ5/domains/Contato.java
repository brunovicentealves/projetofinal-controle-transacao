package com.aj5.BancoAJ5.domains;

import org.hibernate.annotations.JoinColumnOrFormula;

import javax.persistence.*;
import java.util.List;
@Entity
@Table(name = "contato")
public class Contato {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idContato;
    private String telefone;

    //não implementado a relacao
    @ManyToOne
    @JoinColumn(name = "id_endereco" , nullable = false)
    private Endereco endereco;

    private TipoContato tipoContato;

    //private List<PessoaFisicaContato> pessoaFisicaContatoList;
    //private List<PessoaJuridicaContato> pessoaJuridicaContatoList;

    public Contato() {
    }

    public Contato( String telefone, Endereco endereco, TipoContato tipoContato) {
        this.telefone = telefone;
        this.endereco = endereco;
        this.tipoContato = tipoContato;
    }

    public long getIdContato() {
        return idContato;
    }


    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public TipoContato getTipoContato() {
        return tipoContato;
    }

    public void setTipoContato(TipoContato tipoContato) {
        this.tipoContato = tipoContato;
    }
}
