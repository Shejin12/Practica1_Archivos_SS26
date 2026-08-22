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
public class Cita {
    private UUID Id_Doctor;
    private int Id_Paciente;
    private String nombreDoctor, nombrePaciente, motivo, observaciones;
    private enum Estado {PROGRAMADA, ATENDIDA, CANCELADA};
    private Estado estadoCita;

    public Cita(UUID Id_Doctor, int Id_Paciente, String doctor, String paciente, String motivo, String observaciones) {
        this.Id_Doctor = Id_Doctor;
        this.Id_Paciente = Id_Paciente;
        this.nombreDoctor = doctor;
        this.nombrePaciente = paciente;
        this.motivo = motivo;
        this.observaciones = observaciones;
        this.estadoCita = Estado.PROGRAMADA;
    }

    public UUID getId_Doctor() {
        return Id_Doctor;
    }

    public void setId_Doctor(UUID Id_Doctor) {
        this.Id_Doctor = Id_Doctor;
    }

    public int getId_Paciente() {
        return Id_Paciente;
    }

    public void setId_Paciente(int Id_Paciente) {
        this.Id_Paciente = Id_Paciente;
    }

    public String getNombreDoctor() {
        return nombreDoctor;
    }

    public void setNombreDoctor(String nombreDoctor) {
        this.nombreDoctor = nombreDoctor;
    }

    public String getNombrePaciente() {
        return nombrePaciente;
    }

    public void setNombrePaciente(String nombrePaciente) {
        this.nombrePaciente = nombrePaciente;
    }

    public String getMotivo() {
        return motivo;
    }

    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    public Estado getEstadoCita() {
        return estadoCita;
    }

    public void setEstadoCita(int st) {
        switch (st) {
            case 1:
                estadoCita = Estado.PROGRAMADA;
                break;
            case 2:
                estadoCita = Estado.ATENDIDA;
                break;
            case 3:
                estadoCita = Estado.CANCELADA;
                break;
        }
    }
    
    
    
    
    
}
