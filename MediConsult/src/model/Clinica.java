package model;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;

public class Clinica implements Serializable{
    
    private ArrayList<Paciente> pacientes;
    private ArrayList<Medico> medicos;
    private ArrayList<Consulta> consultas;
    
    //Constructor
    public Clinica() {
        pacientes = new ArrayList<>();
        medicos = new ArrayList<>();
        consultas = new ArrayList<>();
    }
    
    
    //Añadir pacientes
    public void agregarPaciente(Paciente paciente){
        pacientes.add(paciente);
    }
    public void agregarMedico(Medico medico){
        medicos.add(medico);
    }
   
    
    //Serializar
    public void guardar() {
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("clinica.dat"))) {
            out.writeObject(this);
        } catch (IOException e) {
            e.printStackTrace();
    }
}

    public static Clinica cargar() {
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream("clinica.dat"))) {
            return (Clinica) in.readObject();
        } catch (IOException | ClassNotFoundException e) {
            return new Clinica(); // Si no existe, crear nueva
        }
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
