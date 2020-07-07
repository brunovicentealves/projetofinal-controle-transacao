package com.aj5.BancoAJ5.service;

import com.aj5.BancoAJ5.domains.Endereco;
import com.aj5.BancoAJ5.repository.EnderecoRepository;
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
public class EnderecoServiceTest {
@Mock
private EnderecoRepository enderecoRepository;

@InjectMocks
private EnderecoService enderecoService;

@Test
public void DeveRetornarEndereco(){

    Endereco endereco1 = new Endereco("rua 16",279,955454545,"casa");
    Endereco endereco2 = new Endereco("rua 17",279,955474545,"apartamento");

    List<Endereco> esperado = Arrays.asList(endereco1,endereco2);

    when(enderecoRepository.findAll()).thenReturn(esperado);

    List<Endereco> listadeEnderecos = enderecoService.findAll();

    assertEquals(2, esperado.size());
    assertEquals(esperado.get(0), listadeEnderecos.get(0)); // quarto 1204
    assertEquals(esperado.get(1), listadeEnderecos.get(1)); // quarto 501

    verify(enderecoRepository, times(1)).findAll();


}



}
