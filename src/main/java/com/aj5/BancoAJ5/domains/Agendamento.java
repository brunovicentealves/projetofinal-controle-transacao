package com.aj5.BancoAJ5.domains;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;
import java.util.Objects;

public class Agendamento {

    private  Long idAgendamento;
    private  Conta idcontaDestino;
    private  Conta idcontaOrigem;
    private  Double valor;
    private Date dataAgenda;
    private Date dataEfetivacao;
    private Boolean statusEfetivado;

    public Agendamento() {
    }

    public Agendamento(Long idAgendamento, Conta idcontaDestino, Conta idcontaOrigem, Double valor, Date dataAgenda, Date dataEfetivacao, Boolean statusEfetivado) {
        this.idAgendamento = idAgendamento;
        this.idcontaDestino = idcontaDestino;
        this.idcontaOrigem = idcontaOrigem;
        this.valor = valor;
        this.dataAgenda = dataAgenda;
        this.dataEfetivacao = dataEfetivacao;
        this.statusEfetivado = statusEfetivado;
    }

    public Long getIdAgendamento() {
        return idAgendamento;
    }

    public Conta getIdcontaDestino() {
        return idcontaDestino;
    }

    public void setIdcontaDestino(Conta idcontaDestino) {
        this.idcontaDestino = idcontaDestino;
    }

    public Conta getIdcontaOrigem() {
        return idcontaOrigem;
    }

    public void setIdcontaOrigem(Conta idcontaOrigem) {
        this.idcontaOrigem = idcontaOrigem;
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

    @Override
    public String toString() {
        return "Agendamento{" +
                "idAgendamento=" + idAgendamento +
                ", idcontaDestino=" + idcontaDestino +
                ", idcontaOrigem=" + idcontaOrigem +
                ", valor=" + valor +
                ", dataAgenda=" + dataAgenda +
                ", dataEfetivacao=" + dataEfetivacao +
                ", statusEfetivado=" + statusEfetivado +
                '}';
    }
}
