//Clase abstracta

package model;

public abstract class Persona {
    
    private String nombre;
    private String cedula;
    private String contrasena;

    public abstract String getTipo();
    
    
    //COnstructor y getter
    public Persona(String nombre, String cedula, String contrasena) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.contrasena = contrasena;
    }
    public String getNombre() {
        return nombre;
    }
    public String getCedula() {
        return cedula;
    }
    public String getContrasena() {
        return contrasena;
    }
}
