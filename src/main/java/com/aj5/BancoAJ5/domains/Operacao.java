package com.aj5.BancoAJ5.domains;

import javax.persistence.*;
import java.util.Date;
import java.util.List;
@Entity
@Table(name = "operacao")
public class Operacao {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idOperacao;

    @ManyToOne
    @JoinColumn(name ="id_tipo_operacao",nullable = false)
    private TipoOperacao tipoOperacao;

    @ManyToOne
    @JoinColumn(name = "id_canal_operacao", nullable = false)
    private CanalOperacao canalOperacao;
    @ManyToOne
    @JoinColumn(name = "id_conta_origem" , nullable = false)
    private Conta contaOrigem;
    @ManyToOne
    @JoinColumn(name = "id_conta_destino" , nullable = false)
    private Conta contaDestino;

    private Date data;
    private String descricao;
    private Double valor;


    public Operacao() {
    }


}
