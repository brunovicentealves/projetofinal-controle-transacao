package com.aj5.BancoAJ5.ControllerTest.agencia;

import com.aj5.BancoAJ5.controller.AgenciaController;
import com.aj5.BancoAJ5.domains.Agencia;
import com.aj5.BancoAJ5.service.AgenciaService;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.http.ResponseEntity;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

public class AgenciaControllerTest {
    private AgenciaService agenciaService = Mockito.mock(AgenciaService.class);
    private AgenciaController agenciaController = new AgenciaController(agenciaService);

    @Test
    public void DeveRetornarTodasAgenciasQueVeemDaService(){
        Agencia agencia_2333 = new Agencia("santander");
        Agencia agencia_2334 = new Agencia("bradesco");
        List<Agencia> listaDeAgencias = Arrays.asList(agencia_2333, agencia_2334);
        ResponseEntity<List<Agencia>> expected = ResponseEntity.ok(listaDeAgencias);

        when(agenciaService.findAll()).thenReturn(listaDeAgencias);

        ResponseEntity<List<Agencia>> actual = agenciaController.getAll();

        assertEquals(expected.getBody(), actual.getBody());

    }

}
