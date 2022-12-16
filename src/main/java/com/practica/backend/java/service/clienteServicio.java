package com.practica.backend.java.service;


import com.practica.backend.java.entity.cliente;
import com.practica.backend.java.repository.clienteRepositorio;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service

@Transactional


public class clienteServicio {

    @Autowired
    clienteRepositorio clienteRepositorio_uno;


    //Por defecto el repositorio al extender de JPA trae el metodo por defecto
    public List<cliente> listaCliente() {
        return clienteRepositorio_uno.findAll();
    }

    public Optional<cliente> getCliente(int idCliente) {
        return clienteRepositorio_uno.findById(idCliente);
    }

    public Optional<cliente> getByNombreTCliente(String nombreCliente) {
        return clienteRepositorio_uno.findByNombreCliente(nombreCliente);
    }

    public void saveCliente(cliente cliente_uno) {
        clienteRepositorio_uno.save(cliente_uno);
    }

    public void deleteCliente(int idCliente) {
        clienteRepositorio_uno.deleteById(idCliente);
    }

    public boolean existsByIdTorre(int idCliente){
        return clienteRepositorio_uno.existsById(idCliente);
    }

    public boolean existsByNombreCliente(String nombreCliente){
        return clienteRepositorio_uno.existsByNombreCliente(nombreCliente);
    }
}