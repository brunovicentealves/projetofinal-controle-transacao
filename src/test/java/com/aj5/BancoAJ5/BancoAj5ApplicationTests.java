package com.aj5.BancoAJ5;

import com.aj5.BancoAJ5.repository.EstadoRepository;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import java.util.Collections;

@RunWith(SpringRunner.class)
@WebMvcTest
class BancoAj5ApplicationTests {
	@Autowired
	MockMvc mockMvc;

	@MockBean
	EstadoRepository estadoRepository ;


	@Test
	void contextLoads() throws Exception {

		Mockito.when(estadoRepository.findAll()).thenReturn(Collections.emptyList());


		MvcResult mvcResult = mockMvc.perform(MockMvcRequestBuilders.get("/estado")
				.accept(MediaType.APPLICATION_JSON)).andReturn();

		Mockito.verify(estadoRepository).findAll();

	}

}
