package com.practica.backend.java.entity;


import jakarta.persistence.*;

@Entity

@Table(name= "cliente")

public class cliente {

    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)

    private int id;
    private String nombres;
    private String apellidos;
    private String tipo;
    private String identificacion;
    private int edad;
    private String ciudad;

    public cliente(int id, String nombres, String apellidos, String tipo, String identificacion, int edad, String ciudad) {
        this.id = id;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.tipo = tipo;
        this.identificacion = identificacion;
        this.edad = edad;
        this.ciudad = ciudad;
    }

    public cliente() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }
}
