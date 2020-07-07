package com.aj5.BancoAJ5.ControllerTest.PessoaFisica;

import com.aj5.BancoAJ5.controller.EstadoController;
import com.aj5.BancoAJ5.controller.PessoaFisicaController;
import com.aj5.BancoAJ5.domains.*;
import com.aj5.BancoAJ5.service.PessoaFisicaService;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.ResponseEntity;

import java.lang.reflect.Array;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

public class PessoaFisicaControllerTest {

    private PessoaFisicaService pessoaFisicaService = Mockito.mock(PessoaFisicaService.class);
    private PessoaFisicaController pessoaFisicaController = new PessoaFisicaController(pessoaFisicaService);

    @Test
    public void DeveRetornarTodasPessoasLista() throws ParseException {

        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        Date data = formato.parse("23/11/1995");

        PessoaFisica pessoaFisica1 = new PessoaFisica("Joao Gomes",data,"96170570091",2.500);
        PessoaFisica pessoaFisica2 = new PessoaFisica("carlos pereira",data,"96179090091",2.300);

        List<PessoaFisica> listaPessoasFisicas = Arrays.asList(pessoaFisica1,pessoaFisica2);
        ResponseEntity<List<PessoaFisica>> expected = ResponseEntity.ok(listaPessoasFisicas);
        //mock
        when(pessoaFisicaService.findAll()).thenReturn(listaPessoasFisicas);

        // Execucao

        ResponseEntity<List<PessoaFisica>> actual = pessoaFisicaController.getAll();
        //validacao
        assertEquals(expected.getBody(), actual.getBody());



    }
}
