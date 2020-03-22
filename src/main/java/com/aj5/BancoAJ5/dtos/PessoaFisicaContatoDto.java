package com.aj5.BancoAJ5.dtos;

public class PessoaFisicaContatoDto {

        private long idPessoaFisica;
        private Long idContato;

    public PessoaFisicaContatoDto(long idPessoaFisica, Long idContato) {
        this.idPessoaFisica = idPessoaFisica;
        this.idContato = idContato;
    }

    public long getIdPessoaFisica() {
        return idPessoaFisica;
    }

    public void setIdPessoaFisica(long idPessoaFisica) {
        this.idPessoaFisica = idPessoaFisica;
    }

    public Long getIdContato() {
        return idContato;
    }

    public void setIdContato(Long idContato) {
        this.idContato = idContato;
    }
}
