//Clase abstracta

package model;

public abstract class Persona {
    
    private String nombre;
    private String cedula;

    public abstract String getTipo();
    
    //Constructor y getter y setter
    
    //Constructor
    public Persona(String nombre, String cedula) {
        this.nombre = nombre;
        this.cedula = cedula;
    }
    
    //Getter y setter
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getCedula() {
        return cedula;
    }
    public void setCedula(String cedula) {
        this.cedula = cedula;
    }
    
    
}
