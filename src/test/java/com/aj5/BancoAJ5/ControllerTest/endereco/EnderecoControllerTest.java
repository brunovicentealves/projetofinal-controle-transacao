package com.aj5.BancoAJ5.ControllerTest.endereco;

import com.aj5.BancoAJ5.controller.EnderecoController;
import com.aj5.BancoAJ5.domains.Cidade;
import com.aj5.BancoAJ5.domains.Endereco;
import com.aj5.BancoAJ5.service.EnderecoService;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.http.ResponseEntity;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

public class EnderecoControllerTest {

    private EnderecoService enderecoService = Mockito.mock(EnderecoService.class);
    private EnderecoController enderecoController = new EnderecoController(enderecoService);


    @Test
    public void DeveRetornarListaDeEnderecos(){
        Endereco endereco1 = new Endereco();
        Endereco endereco2 = new Endereco();
        List<Endereco> listaDeEnderecos = Arrays.asList(endereco1,endereco2);
        ResponseEntity<List<Endereco>> expected = ResponseEntity.ok(listaDeEnderecos);


        when(enderecoService.findAll()).thenReturn(listaDeEnderecos);

        ResponseEntity<List<Endereco>> actual = enderecoController.getAll();
        assertEquals(expected.getBody(), actual.getBody());
    }
}
