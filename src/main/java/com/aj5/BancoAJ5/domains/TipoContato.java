package com.aj5.BancoAJ5.domains;
import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "tipo_contato")
public class TipoContato {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idTipoContato;
    private String descricao;

    @OneToMany(mappedBy = "tipocontato")
    List<Contato> contatoslist;

    public TipoContato() {
    }

    public TipoContato(String descricao) {
        this.descricao = descricao;
    }


    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public List<Contato> getContatoslist() {
        return contatoslist;
    }

    public void setContatoslist(List<Contato> contatoslist) {
        this.contatoslist = contatoslist;
    }
}
