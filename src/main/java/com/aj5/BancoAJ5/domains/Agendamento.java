package com.aj5.BancoAJ5.domains;

import javax.persistence.*;
import java.util.Date;
import java.util.Objects;
@Entity
@Table(name = "agendamento")
public class Agendamento {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Long idAgendamento;
    private  Double valor;
    private Date dataAgenda;
    private Date dataEfetivacao;
    private Boolean statusEfetivado;
    @ManyToOne
    @JoinColumn(name = "id_conta_destino",nullable = false)
    private  Conta contaDestino;

    @ManyToOne
    @JoinColumn(name = "id_conta_origem")
    private  Conta contaOrigem;


    public Agendamento() {
    }

    public Agendamento(Long idAgendamento, Conta idcontaDestino, Conta idcontaOrigem, Double valor, Date dataAgenda, Date dataEfetivacao, Boolean statusEfetivado) {
        this.idAgendamento = idAgendamento;
        this.contaDestino = idcontaDestino;
        this.contaOrigem = idcontaOrigem;
        this.valor = valor;
        this.dataAgenda = dataAgenda;
        this.dataEfetivacao = dataEfetivacao;
        this.statusEfetivado = statusEfetivado;
    }

    public Agendamento( Conta idcontaDestino, Conta idcontaOrigem, Double valor, Date dataAgenda, Date dataEfetivacao, Boolean statusEfetivado) {
        this.contaDestino = idcontaDestino;
        this.contaOrigem = idcontaOrigem;
        this.valor = valor;
        this.dataAgenda = dataAgenda;
        this.dataEfetivacao = dataEfetivacao;
        this.statusEfetivado = statusEfetivado;
    }

    public Long getIdAgendamento() {
        return idAgendamento;
    }

    public Conta getIdcontaDestino() {
        return contaDestino;
    }

    public void setIdcontaDestino(Conta idcontaDestino) {
        this.contaDestino = idcontaDestino;
    }

    public Conta getIdcontaOrigem() {
        return contaOrigem;
    }

    public void setIdcontaOrigem(Conta idcontaOrigem) {
        this.contaOrigem = idcontaOrigem;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public Date getDataAgenda() {
        return dataAgenda;
    }

    public void setDataAgenda(Date dataAgenda) {
        this.dataAgenda = dataAgenda;
    }

    public Date getDataEfetivacao() {
        return dataEfetivacao;
    }

    public void setDataEfetivacao(Date dataEfetivacao) {
        this.dataEfetivacao = dataEfetivacao;
    }

    public Boolean getStatusEfetivado() {
        return statusEfetivado;
    }

    public void setStatusEfetivado(Boolean statusEfetivado) {
        this.statusEfetivado = statusEfetivado;
    }


}
