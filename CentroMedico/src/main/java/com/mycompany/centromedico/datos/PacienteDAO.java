/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.centromedico.datos;

import java.io.IOException;
import java.io.RandomAccessFile;

public class PacienteDAO {

    private final String archivo = "pacientes.dat";

    public void guardar(Paciente paciente) throws IOException {

        try (RandomAccessFile raf = new RandomAccessFile(archivo, "rw")) {

            raf.seek(raf.length());

            raf.writeUTF(paciente.getDPI());
            raf.writeUTF(paciente.getTelefono());
            raf.writeUTF(paciente.getNombre());
            raf.writeUTF(paciente.getApellido());
            raf.writeUTF(paciente.getCorreo());
            raf.writeUTF(paciente.getSexo());
            raf.writeUTF(paciente.getSangre());
            raf.writeUTF(paciente.getFechaNacimiento().toString());
            raf.writeBoolean(paciente.isActivo());
        }
    }
}