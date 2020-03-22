package com.aj5.BancoAJ5.dtos;

public class ContatoDto {

    private String telefone;
    private long idEndereco;
    private  long idTipoContato;


    public ContatoDto(String telefone, long idEndereco, long idTipoContato) {
        this.telefone = telefone;
        this.idEndereco = idEndereco;
        this.idTipoContato = idTipoContato;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public long getIdEndereco() {
        return idEndereco;
    }

    public void setIdEndereco(long idEndereco) {
        this.idEndereco = idEndereco;
    }

    public long getIdTipoContato() {
        return idTipoContato;
    }

    public void setIdTipoContato(long idTipoContato) {
        this.idTipoContato = idTipoContato;
    }
}
