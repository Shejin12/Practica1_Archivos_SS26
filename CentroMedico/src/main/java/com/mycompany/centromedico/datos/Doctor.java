/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.centromedico.datos;

import java.util.UUID;

/**
 *
 * @author chejo
 */


public class Doctor {
    private UUID id;
    private String nombre, apellido, especialidad, correo;
    private boolean activo;
    private int telefono;

    public Doctor(String nombre, String apellido, String especialidad, String correo, boolean activo, int telefono) {
        this.id = UUID.randomUUID();
        this.nombre = nombre;
        this.apellido = apellido;
        this.especialidad = especialidad;
        this.correo = correo;
        this.activo = activo;
        this.telefono = telefono;
    }

    public UUID getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public String getCorreo() {
        return correo;
    }

    public boolean isActivo() {
        return activo;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }
    
    
}
