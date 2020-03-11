package com.aj5.BancoAJ5;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;

import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

import springfox.documentation.service.Contact;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.Collections;


@SpringBootApplication
@EnableSwagger2
public class BancoAj5Application {

	public static void main(String[] args) {

		SpringApplication.run(BancoAj5Application.class, args);
	}

	@Bean
	public Docket productApi() {
		return new Docket(DocumentationType.SWAGGER_2).select()
				.apis(RequestHandlerSelectors.basePackage("com.aj5.BancoAJ5.controller")).build().apiInfo(apiInfo());
	}

	private ApiInfo apiInfo() {
		@SuppressWarnings("deprecation")

		ApiInfo apiInfo = new ApiInfo(
				"API REST - Controle de transação Bancaria",
				"Foi criado essa Api para guardar todas as transações bancarias ",
				"Versão API 1.0",
				"Termos de uso",
				"contato@e-mail.com",
				"API License",
				"API License URL"
		);
		return apiInfo;
	}
}
