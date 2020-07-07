package com.aj5.BancoAJ5.service;


import com.aj5.BancoAJ5.domains.Estado;
import com.aj5.BancoAJ5.repository.EstadoRepository;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;

@ExtendWith(SpringExtension.class)
public class EstadoServiceTest {
    @Mock
    private EstadoRepository estadoRepository;

    @InjectMocks
    private EstadoService estadoService;

    @Test
    public void DeveRetornarTodosEstados(){

        Estado estado1 = new Estado("Rio grande do sul","Rs");
        Estado estado2 = new Estado("Santa catarina","Sc");

        List<Estado> esperado = Arrays.asList(estado1, estado2);

        when(estadoRepository.findAll()).thenReturn(esperado);

        List<Estado> listaEstados= estadoService.findAll();

        assertEquals(2, esperado.size());
        assertEquals(esperado.get(0), listaEstados.get(0)); // quarto 1204
        assertEquals(esperado.get(1), listaEstados.get(1)); // quarto 501

        verify(estadoRepository, times(1)).findAll();

    }




}
