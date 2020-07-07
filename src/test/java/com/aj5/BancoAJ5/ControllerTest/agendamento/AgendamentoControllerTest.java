package com.aj5.BancoAJ5.ControllerTest.agendamento;

import com.aj5.BancoAJ5.controller.AgendamentoController;
import com.aj5.BancoAJ5.domains.Agendamento;
import com.aj5.BancoAJ5.domains.Conta;
import com.aj5.BancoAJ5.service.AgendamentoService;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class AgendamentoControllerTest {
    private AgendamentoService agendamentoService = Mockito.mock(AgendamentoService.class);
    private AgendamentoController agendamentoController = new AgendamentoController(agendamentoService);

    @Test
    public void DeveRetornarTodosOsAgendamento(){
        Conta contaOrigem = new Conta();
        Conta contaDestino= new Conta();
        Agendamento agendamento_12 = new Agendamento();


    }

}
