package com.practica.backend.java.controller;

import com.practica.backend.java.entity.cliente;
import com.practica.backend.java.service.clienteServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController

@RequestMapping("/cliente")

@CrossOrigin(origins = "http://localhost:4200")
public class clienteControlador {
    @Autowired
    clienteServicio clienteServicio_uno;

   @GetMapping("/listaCliente")
    public ResponseEntity <List<cliente>> listaCliente(){

       List<cliente> clientes = clienteServicio.listaCliente();
       return new ResponseEntity<List<cliente>>(clientes, HttpStatus.OK);
   }


}
