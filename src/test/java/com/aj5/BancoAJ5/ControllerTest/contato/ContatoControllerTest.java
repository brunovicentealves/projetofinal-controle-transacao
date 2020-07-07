package com.aj5.BancoAJ5.ControllerTest.contato;

import com.aj5.BancoAJ5.controller.ContatoController;
import com.aj5.BancoAJ5.domains.Contato;
import com.aj5.BancoAJ5.domains.Endereco;
import com.aj5.BancoAJ5.domains.TipoContato;
import com.aj5.BancoAJ5.service.ContatoService;
import org.junit.Test;
import org.mockito.Mockito;
import org.springframework.http.ResponseEntity;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

public class ContatoControllerTest {

    private ContatoService contatoService = Mockito.mock(ContatoService.class);
    private ContatoController contatoController = new ContatoController(contatoService);

    @Test
    public void DeveRetornarTodosContatos(){

        Endereco endereco = new Endereco();
        TipoContato tipoContato = new TipoContato();

        Contato contato1 = new Contato("51-9995-5454",endereco,tipoContato);
        Contato contato2 = new Contato("51-9995-5454",endereco,tipoContato);

        List<Contato> listaDecontato = Arrays.asList(contato1,contato2);
        ResponseEntity<List<Contato>> expected = ResponseEntity.ok(listaDecontato);

        when(contatoService.findAll()).thenReturn(listaDecontato);

        ResponseEntity<List<Contato>> actual = contatoController.getAll();
        assertEquals(expected.getBody(), actual.getBody());







    }
}
