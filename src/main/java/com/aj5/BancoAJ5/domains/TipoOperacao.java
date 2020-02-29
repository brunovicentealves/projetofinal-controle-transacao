package com.aj5.BancoAJ5.domains;

public class TipoOperacao {

    private Long idTipoOperacao;
    private Long codTipoOperacao;
    private String nomeTipoOpercacao;

    public TipoOperacao() {
    }

    public TipoOperacao(Long idTipoOperacao, Long codTipoOperacao, String nomeTipoOpercacao) {
        this.idTipoOperacao = idTipoOperacao;
        this.codTipoOperacao = codTipoOperacao;
        this.nomeTipoOpercacao = nomeTipoOpercacao;
    }

    public Long getIdTipoOperacao() {
        return idTipoOperacao;
    }

    public Long getCodTipoOperacao() {
        return codTipoOperacao;
    }

    public void setCodTipoOperacao(Long codTipoOperacao) {
        this.codTipoOperacao = codTipoOperacao;
    }

    public String getNomeTipoOpercacao() {
        return nomeTipoOpercacao;
    }

    public void setNomeTipoOpercacao(String nomeTipoOpercacao) {
        this.nomeTipoOpercacao = nomeTipoOpercacao;
    }

    @Override
    public String toString() {
        return "TipoOperacao{" +
                "idTipoOperacao=" + idTipoOperacao +
                ", codTipoOperacao=" + codTipoOperacao +
                ", nomeTipoOpercacao='" + nomeTipoOpercacao + '\'' +
                '}';
    }
}
