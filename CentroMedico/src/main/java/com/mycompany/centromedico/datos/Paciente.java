/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.centromedico.datos;

import java.time.LocalDate;

/**
 *
 * @author chejo
 */
public class Paciente {
    private String  DPI, telefono, nombre, apellido, correo, sexo, sangre;
    private LocalDate fechaNacimiento;
    private boolean activo;

    public Paciente(String DPI, String telefono, String nombre, String apellido, String correo, String sexo, String sangre, LocalDate fechaNacimiento) {
        this.DPI = DPI;
        this.telefono = telefono;
        this.nombre = nombre;
        this.apellido = apellido;
        this.correo = correo;
        this.sexo = sexo;
        this.sangre = sangre;
        this.fechaNacimiento = fechaNacimiento;
        this.activo = true;
    }

    public String getDPI() {
        return DPI;
    }

    public void setDPI(String DPI) {
        this.DPI = DPI;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getSangre() {
        return sangre;
    }

    public void setSangre(String sangre) {
        this.sangre = sangre;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }
    
    
}
