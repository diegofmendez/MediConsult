package model;

public class Medico extends Persona {
    
    @Override
    public String getTipo(){
        return "Paciente";
    }
    
    //Constructor(El mismo que el de la clase abstracta
    
    public Medico(String nombre, String cedula, String contrasena) {
        super(nombre, cedula, contrasena);
        
    }
}
