package com.aj5.BancoAJ5.domains;

import org.hibernate.annotations.Cascade;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "pessoafisicacontato")
public class PessoaFisicaContato implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idPessoaFisicaContato;

    @ManyToOne
    @JoinColumn(name = "id_pessoa_juridica", nullable = false)
    private PessoaFisica pessoaFisica;

    @ManyToOne
    @JoinColumn(name = "id_contato", nullable = false)
    private Contato contato;

    public PessoaFisicaContato() {
    }

    public PessoaFisicaContato(PessoaFisica pessoaFisica, Contato contato) {
        this.pessoaFisica = pessoaFisica;
        this.contato = contato;
    }

    public PessoaFisica getPessoaFisica() {
        return pessoaFisica;
    }

    public void setPessoaFisica(PessoaFisica pessoaFisica) {
        this.pessoaFisica = pessoaFisica;
    }

    public Contato getContato() {
        return contato;
    }

    public void setContato(Contato contato) {
        this.contato = contato;
    }


}
