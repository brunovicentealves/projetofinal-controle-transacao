package com.aj5.BancoAJ5.ControllerTest.canalOperacao;

import com.aj5.BancoAJ5.controller.CanalOperacaoController;
import com.aj5.BancoAJ5.service.CanalOperacaoService;
import com.aj5.BancoAJ5.domains.*;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.http.ResponseEntity;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

public class CanalOperacaoControllerTest {

    private CanalOperacaoService canalOperacaoService = Mockito.mock(CanalOperacaoService.class);
    private CanalOperacaoController canalOperacaoController =  new CanalOperacaoController(canalOperacaoService);

    @Test
    public void DeveRetornarTodosCanaisOperacao(){

        CanalOperacao canalOperacao = new CanalOperacao(500,"Saque");

        List<CanalOperacao> listaDeCanalOperacao = Arrays.asList(canalOperacao);
        ResponseEntity<List<CanalOperacao>> expected = ResponseEntity.ok(listaDeCanalOperacao);

        when(canalOperacaoService.findAll()).thenReturn(listaDeCanalOperacao);

        ResponseEntity<List<CanalOperacao>> actual = canalOperacaoController.getAll();
        assertEquals(expected.getBody(), actual.getBody());



    }
}
