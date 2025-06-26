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

    public void registrarConsulta(Consulta consulta) {
        consultas.add(consulta);
    }

    public ArrayList<Consulta> obtenerHistorialPaciente(String cedulaPaciente) {
        ArrayList<Consulta> resultado = new ArrayList<>();
        for (Consulta c : consultas) {
            if (c.getPaciente().getCedula().equals(cedulaPaciente)) {
                resultado.add(c);
            }
        }
        return resultado;
    }

    public ArrayList<Consulta> obtenerConsultasMedico(String cedulaMedico) {
        ArrayList<Consulta> resultado = new ArrayList<>();
        for (Consulta c : consultas) {
            if (c.getMedico().getCedula().equals(cedulaMedico)) {
                resultado.add(c);
            }
        }
        return resultado;
    }

    
    
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
