package com.practica.backend.java.repository;

import com.practica.backend.java.entity.cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
@Repository
public interface clienteRepositorio extends JpaRepository<cliente, Integer> {
    Optional<cliente> findByNombreCliente(String nombreCliente);

    boolean existsByNombreCliente(String nombreCliente);



}
