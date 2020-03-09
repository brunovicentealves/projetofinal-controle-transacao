package com.aj5.BancoAJ5.domains;

import javax.persistence.*;
import java.util.List;
@Entity
@Table(name ="tipo_operacao")
public class TipoOperacao {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idTipoOperacao;
    private String codTipoOperacao;
    private String nomeTipoOpercacao;


    @OneToMany(mappedBy = "tipoOperacao")
    private List<Taxa> taxaList;

    public TipoOperacao() {
    }

    public TipoOperacao(String codTipoOperacao, String nomeTipoOpercacao, List<Taxa> taxaList) {
        this.codTipoOperacao = codTipoOperacao;
        this.nomeTipoOpercacao = nomeTipoOpercacao;
        this.taxaList = taxaList;
    }

    public Long getIdTipoOperacao() {
        return idTipoOperacao;
    }

    public String getCodTipoOperacao() {
        return codTipoOperacao;
    }

    public void setCodTipoOperacao(String codTipoOperacao) {
        this.codTipoOperacao = codTipoOperacao;
    }

    public String getNomeTipoOpercacao() {
        return nomeTipoOpercacao;
    }

    public void setNomeTipoOpercacao(String nomeTipoOpercacao) {
        this.nomeTipoOpercacao = nomeTipoOpercacao;
    }

    public List<Taxa> getTaxaList() {
        return taxaList;
    }

    public void setTaxaList(List<Taxa> taxaList) {
        this.taxaList = taxaList;
    }


}
