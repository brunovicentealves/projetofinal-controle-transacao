package com.aj5.BancoAJ5.domains;

import javax.persistence.*;
import java.util.List;
@Entity
@Table(name = "taxa_conta")
public class TaxaConta {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idTaxaConta;

    @OneToMany(mappedBy = "taxa_conta")
    private List<Conta> contaList;

    @ManyToOne
    @JoinColumn(name = "id_taxa",nullable = false)
   private Taxa taxa;

    public TaxaConta() {
    }

    public TaxaConta(List<Conta> contaList, Taxa taxa) {
        this.contaList = contaList;
        this.taxa = taxa;
    }

    public List<Conta> getContaList() {
        return contaList;
    }

    public void setContaList(List<Conta> contaList) {
        this.contaList = contaList;
    }

    public Taxa getTaxa() {
        return taxa;
    }

    public void setTaxa(Taxa taxa) {
        this.taxa = taxa;
    }
}
