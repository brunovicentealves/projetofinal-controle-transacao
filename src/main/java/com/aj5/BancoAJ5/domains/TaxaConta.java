package com.aj5.BancoAJ5.domains;

import javax.persistence.*;
import java.util.List;
@Entity
@Table(name = "taxa_conta")
public class TaxaConta {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idTaxaConta;

    @OneToMany(mappedBy = "taxaConta")
    private List<Conta> contaList;


   // private Taxa idTaxa;

    public TaxaConta() {
    }











}
