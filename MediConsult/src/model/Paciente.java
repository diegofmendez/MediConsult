
package model;

public class Paciente extends Persona{
    
    @Override
    public String getTipo(){
        return "Paciente";
    }
    
    //Constructor(El mismo que el de la clase abstracta
    
    public Paciente(String nombre, String cedula, String contrasena) {
        super(nombre, cedula, contrasena);
        
    }
}
