package com.aj5.BancoAJ5.domains;

import javax.persistence.*;

@Entity
@Table(name = "pessoa_juridico_contato")
public class PessoaJuridicaContato {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idPessoaFisicaContato;

    @ManyToOne
    @JoinColumn(name = "id_pessoa_juridica",nullable = false)
    private PessoaJuridica pessoaJuridica;

    @ManyToOne
    @JoinColumn(name = "id_contato",nullable = false)
    private Contato contato;

    public PessoaJuridicaContato(PessoaJuridica pessoaJuridica, Contato contato) {
        this.pessoaJuridica = pessoaJuridica;
        this.contato = contato;
    }



    public PessoaJuridicaContato() {
    }

    public Contato getContato() {
        return contato;
    }

    public void setContato(Contato contato) {
        this.contato = contato;
    }

    public PessoaJuridica getPessoaJuridica() {
        return pessoaJuridica;
    }

    public void setPessoaJuridica(PessoaJuridica pessoaJuridica) {
        this.pessoaJuridica = pessoaJuridica;
    }
}
