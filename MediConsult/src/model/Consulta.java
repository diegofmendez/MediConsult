package model;

import java.io.Serializable;

public class Consulta implements Serializable{
    private Paciente paciente;
    private Medico medico;
    private String sintomas;
    private String diagnostico;
    private String tratamiento;
    
    //Constructor
    public Consulta(Paciente paciente, Medico medico, String sintomas,
        String diagnostico, String tratamiento) {
        this.paciente = paciente;
        this.medico = medico;
        this.sintomas = sintomas;
        this.diagnostico = diagnostico;
        this.tratamiento = tratamiento;
    }  
    
    //getter y setter
    public Paciente getPaciente() {
        return paciente;
    }
    public Medico getMedico() {
        return medico;
    }
    public String getSintomas() {
        return sintomas;
    }
    public String getDiagnostico() {
        return diagnostico;
    }
    public String getTratamiento() {
        return tratamiento;
    }
    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }
    public void setMedico(Medico medico) {
        this.medico = medico;
    }
    public void setSintomas(String sintomas) {
        this.sintomas = sintomas;
    }
    public void setDiagnostico(String diagnostico) {
        this.diagnostico = diagnostico;
    }
    public void setTratamiento(String tratamiento) {
        this.tratamiento = tratamiento;
    }
    
 
}
