package com.aj5.BancoAJ5.domains;

public class CanalOperacao {

    private Long canalOperacao;
    private String codCanalOperacao;
    private String nomecanalOperacao;

    public CanalOperacao() {
    }

    public CanalOperacao(Long canalOperacao, String codCanalOperacao, String nomecanalOperacao) {
        this.canalOperacao = canalOperacao;
        this.codCanalOperacao = codCanalOperacao;
        this.nomecanalOperacao = nomecanalOperacao;
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

    @Override
    public String toString() {
        return "CanalOperacao{" +
                "canalOperacao=" + canalOperacao +
                ", codCanalOperacao='" + codCanalOperacao + '\'' +
                ", nomecanalOperacao='" + nomecanalOperacao + '\'' +
                '}';
    }
}
