/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.centromedico.datos;

/**
 *
 * @author chejo
 */
public class Paciente {
    private int DPI, telefono;
    private enum Sexo {MASCULINO, FEMENINO};
    private Sexo sexoPaciente;
    private enum Sangre {A_POSITIVO, A_NEGATIVO, B_POSITIVO, B_NEGATIVO, AB_POSITIVO, AB_NEGATIVO, O_POSITIVO, O_NEGATIVO};
    private Sangre tipoSangre;
    private String nombre, apellido, correo;

    public Paciente(int DPI, int telefono, String nombre, String apellido, String correo) {
        this.DPI = DPI;
        this.telefono = telefono;
        this.nombre = nombre;
        this.apellido = apellido;
        this.correo = correo;
    }

    public int getDPI() {
        return DPI;
    }

    public void setDPI(int DPI) {
        this.DPI = DPI;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
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
    
    public void setSexo(boolean male){
        sexoPaciente = (male) ? Sexo.MASCULINO : Sexo.FEMENINO;
    }
    
    public void setSangre(String sangre){
        switch (sangre) {
            case "A+" ->    tipoSangre = Sangre.A_POSITIVO;
            case "A-" ->    tipoSangre = Sangre.A_NEGATIVO;
            case "B+" ->    tipoSangre = Sangre.B_POSITIVO;
            case "B-" ->    tipoSangre = Sangre.B_NEGATIVO;
            case "AB+" ->   tipoSangre = Sangre.AB_POSITIVO;
            case "AB-" ->   tipoSangre = Sangre.AB_NEGATIVO;
            case "O+" ->    tipoSangre = Sangre.O_POSITIVO;
            case "O-" ->    tipoSangre = Sangre.O_NEGATIVO;
        }
    }
}
