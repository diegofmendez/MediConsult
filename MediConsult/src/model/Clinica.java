package model;

import java.io.Serializable;
import java.util.ArrayList;

public class Clinica implements Serializable{
    
    private ArrayList<Paciente> pacientes;
    private ArrayList<Medico> medicos;
    private ArrayList<Consulta> consultas;

    public Clinica() {
        pacientes = new ArrayList<>();
        medicos = new ArrayList<>();
        consultas = new ArrayList<>();
    }

    public void agregarPaciente(Paciente paciente){
        
    }
    
    
    //Getters
    public ArrayList<Paciente> getPacientes() {
        return pacientes;
    }
    public ArrayList<Medico> getMedicos() {
        return medicos;
    }
    public ArrayList<Consulta> getConsultas() {
        return consultas;
    }
}
