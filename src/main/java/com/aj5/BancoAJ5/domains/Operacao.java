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

    public Operacao(TipoOperacao tipoOperacao, CanalOperacao canalOperacao, Conta contaOrigem, Conta contaDestino, Date data, String descricao, Double valor) {
        this.tipoOperacao = tipoOperacao;
        this.canalOperacao = canalOperacao;
        this.contaOrigem = contaOrigem;
        this.contaDestino = contaDestino;
        this.data = data;
        this.descricao = descricao;
        this.valor = valor;
    }


    public TipoOperacao getTipoOperacao() {
        return tipoOperacao;
    }

    public void setTipoOperacao(TipoOperacao tipoOperacao) {
        this.tipoOperacao = tipoOperacao;
    }

    public CanalOperacao getCanalOperacao() {
        return canalOperacao;
    }

    public void setCanalOperacao(CanalOperacao canalOperacao) {
        this.canalOperacao = canalOperacao;
    }

    public Conta getContaOrigem() {
        return contaOrigem;
    }

    public void setContaOrigem(Conta contaOrigem) {
        this.contaOrigem = contaOrigem;
    }

    public Conta getContaDestino() {
        return contaDestino;
    }

    public void setContaDestino(Conta contaDestino) {
        this.contaDestino = contaDestino;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }
}
