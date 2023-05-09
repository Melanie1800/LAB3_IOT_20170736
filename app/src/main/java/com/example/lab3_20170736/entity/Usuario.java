package com.example.lab3_20170736.entity;

public class Usuario {
    private Integer idusuario;
    private String nombre;
    private String genero;
    private String dni;
    private String descripcion;
    private String ruta;
    private String nombremascota;

    public Usuario(String nombre, String genero, String dni, String descripcion, String ruta, String nombremascota) {
        this.nombre = nombre;
        this.genero = genero;
        this.dni = dni;
        this.descripcion = descripcion;
        this.ruta = ruta;
        this.nombremascota = nombremascota;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombremascota() {
        return nombremascota;
    }

    public void setNombremascota(String nombremascota) {
        this.nombremascota = nombremascota;
    }

    public Integer getIdusuario() {
        return idusuario;
    }

    public void setIdusuario(Integer idusuario) {
        this.idusuario = idusuario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getRuta() {
        return ruta;
    }

    public void setRuta(String ruta) {
        this.ruta = ruta;
    }
}
