package com.aj5.BancoAJ5.domains;

import javax.persistence.*;
import java.util.List;
@Entity
@Table(name = "canal_operacao")
public class CanalOperacao {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long canalOperacao;
    private String codCanalOperacao;
    private String nomecanalOperacao;

    @OneToMany(mappedBy = "canalOperacao")
    private List<LimiteCanal> limiteCanalList;

    @OneToMany(mappedBy = "canalOperacao")
    private List<Operacao> operacaoList;

    public CanalOperacao() {
    }

    public CanalOperacao(String codCanalOperacao, String nomecanalOperacao, List<LimiteCanal> limiteCanalList, List<Operacao> operacaoList) {
        this.codCanalOperacao = codCanalOperacao;
        this.nomecanalOperacao = nomecanalOperacao;
        this.limiteCanalList = limiteCanalList;
        this.operacaoList = operacaoList;
    }

    public Long getCanalOperacao() {
        return canalOperacao;
    }

    public String getCodCanalOperacao() {
        return codCanalOperacao;
    }

    public void setCodCanalOperacao(String codCanalOperacao) {
        this.codCanalOperacao = codCanalOperacao;
    }

    public String getNomecanalOperacao() {
        return nomecanalOperacao;
    }

    public void setNomecanalOperacao(String nomecanalOperacao) {
        this.nomecanalOperacao = nomecanalOperacao;
    }

    public List<LimiteCanal> getLimiteCanalList() {
        return limiteCanalList;
    }

    public void setLimiteCanalList(List<LimiteCanal> limiteCanalList) {
        this.limiteCanalList = limiteCanalList;
    }

    public List<Operacao> getOperacaoList() {
        return operacaoList;
    }

    public void setOperacaoList(List<Operacao> operacaoList) {
        this.operacaoList = operacaoList;
    }
}
