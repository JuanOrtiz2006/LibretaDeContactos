package ec.edu.ups.poo.clases;

public class Persona {
    private String cedula;
    private String nombres;
    private String apellidos;
    private String direccion;

    public Persona(String cedula, String nombres, String apellidos, String direccion) {
        this.cedula = null;
        this.nombres = null;
        this.apellidos = null;
        this.direccion = null;
    }
    public Persona() {}

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }
    public void setNombres(String nombres) {
        this.nombres = nombres;
    }
    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    @Override
    public String toString() {
        return "\nCedula: " + cedula + "\nNombres: " + nombres + "\nApellidos: " + apellidos + "\nDireccion: " + direccion;
    }

    public String getCedula() {
        return cedula;
    }
    public String getNombres() {
        return nombres;
    }
    public String getApellidos() {
        return apellidos;
    }
    public String getDireccion() {
        return direccion;
    }
}