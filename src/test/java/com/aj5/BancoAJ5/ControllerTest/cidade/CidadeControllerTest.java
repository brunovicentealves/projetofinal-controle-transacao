package com.aj5.BancoAJ5.ControllerTest.cidade;

import com.aj5.BancoAJ5.controller.CidadeController;
import com.aj5.BancoAJ5.domains.Cidade;
import com.aj5.BancoAJ5.domains.Estado;
import com.aj5.BancoAJ5.service.CidadeService;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.http.ResponseEntity;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

public class CidadeControllerTest {


    private CidadeService cidadeService = Mockito.mock(CidadeService.class);
    private CidadeController cidadeController = new CidadeController (cidadeService);

    @Test
    public void DeveRetornarTodasAsCidade(){
        Estado estado = new Estado("Rio grande do sul ","Rs");
        Cidade cidade1 = new Cidade("Porto Alegre",estado);
        Cidade cidade2 = new Cidade("Pinheira",estado);

        List<Cidade> listaDeCidade = Arrays.asList(cidade1,cidade2);
        ResponseEntity<List<Cidade>> expected = ResponseEntity.ok(listaDeCidade);

        when(cidadeService.findAll()).thenReturn(listaDeCidade);

        ResponseEntity<List<Cidade>> actual = cidadeController.getAll();
        assertEquals(expected.getBody(), actual.getBody());


    }
}
