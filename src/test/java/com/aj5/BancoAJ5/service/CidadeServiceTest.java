package com.aj5.BancoAJ5.service;

import com.aj5.BancoAJ5.domains.Cidade;
import com.aj5.BancoAJ5.repository.CidadeRepository;
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
public class CidadeServiceTest {

    @Mock
    private CidadeRepository cidadeRepository;

    @InjectMocks
    private CidadeService  cidadeService;

    @Test
    public void DeveRetornarCidades(){

        Cidade cidade1 = new Cidade(1l,"porto alegre");
        Cidade cidade2 = new Cidade(2l,"palhoca");

        List<Cidade> esperado = Arrays.asList(cidade1, cidade2);

        when(cidadeRepository.findAll()).thenReturn(esperado);

        List<Cidade> quartosParaLimpeza = cidadeService.findAll();


        assertEquals(2, esperado.size());
        assertEquals(esperado.get(0), quartosParaLimpeza.get(0)); // quarto 1204
        assertEquals(esperado.get(1), quartosParaLimpeza.get(1)); // quarto 501

        verify(cidadeRepository, times(1)).findAll();

    }
}
