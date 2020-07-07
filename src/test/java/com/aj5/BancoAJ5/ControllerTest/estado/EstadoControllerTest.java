package com.aj5.BancoAJ5.ControllerTest.estado;

import com.aj5.BancoAJ5.controller.EstadoController;
import com.aj5.BancoAJ5.domains.Estado;
import com.aj5.BancoAJ5.service.EstadoService;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.ResponseEntity;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;


public class EstadoControllerTest {

    private EstadoService estadoService = Mockito.mock(EstadoService.class);
    private EstadoController estadoController = new EstadoController(estadoService);

    @Test
    public  void DeveRetornarTodosEstados(){

        // entrada
        Estado estado = new Estado("Rio grande do Sul","Rs");
        Estado estado2 = new Estado("Santa Catarina","Sc");
        List<Estado> listaEstado = Arrays.asList(estado,estado2);
        ResponseEntity<List<Estado>> expected = ResponseEntity.ok(listaEstado);
        //mock
        when(estadoService.findAll()).thenReturn(listaEstado);

        // Execucao

        ResponseEntity<List<Estado>> actual = estadoController.getAll();
        //validacao
        assertEquals(expected.getBody(), actual.getBody());
    }


}
