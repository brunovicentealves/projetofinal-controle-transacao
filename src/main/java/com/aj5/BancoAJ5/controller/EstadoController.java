package com.aj5.BancoAJ5.controller;

import io.swagger.annotations.ApiOperation;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/estado")
public class EstadoController {


    @ApiOperation(value="Consulta todos clientes do sistema", notes="Consulta síncrona.")
    @GetMapping
    public ResponseEntity consultaClientes() {
        return ResponseEntity.status(HttpStatus.OK).body("Consulta de clientes executada com sucesso!");
    }

}
