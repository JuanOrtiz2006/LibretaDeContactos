package ec.edu.ups.poo.clases;
import java.util.GregorianCalendar;
import java.util.Calendar;

public class Familiar extends Persona {
    private String parentesco;
    private String tipoSangre;
    private GregorianCalendar fechaDeNacimiento;

    public Familiar() {}
    public Familiar(String cedula, String nombres, String apellidos, String direccion, String parentesco, String tipoSangre, GregorianCalendar fechaDeNacimiento) {
        super(cedula, nombres, apellidos, direccion);
        this.parentesco = parentesco;
        this.tipoSangre = tipoSangre;
        this.fechaDeNacimiento = fechaDeNacimiento;

    }

    public void setParentesco(String parentesco) {
        this.parentesco = parentesco;
    }
    public void setTipoSangre(String tipoSangre) {
        this.tipoSangre = tipoSangre;
    }
    public void setFechaDeNacimiento(GregorianCalendar fechaDeNacimiento) {
        this.fechaDeNacimiento = fechaDeNacimiento;
    }

    public String getParentesco() {
        return parentesco;
    }
    public String getTipoSangre() {
        return tipoSangre;
    }
    public GregorianCalendar getFechaDeNacimiento() {
        return fechaDeNacimiento;
    }

    public double calcularEdad() {
        Calendar hoy = new GregorianCalendar();
        int anio = hoy.get(Calendar.YEAR);
        int mes = hoy.get(Calendar.MONTH);
        int dia = hoy.get(Calendar.DAY_OF_MONTH);

        int anioNacimiento = fechaDeNacimiento.get(Calendar.YEAR);
        int mesNacimiento = fechaDeNacimiento.get(Calendar.MONTH);
        int diaNacimiento = fechaDeNacimiento.get(Calendar.DAY_OF_MONTH);
        int edad = anio - anioNacimiento;

        if (mes < mesNacimiento || (mes == mesNacimiento && dia < diaNacimiento)) {
            edad--;
        }
        return edad;
    }

    @Override
    public String toString() {
        return super.toString() + "\nParentesco: " + parentesco + "\nTipo de Sangre: " + tipoSangre + "\nEdad: " + calcularEdad();
    }
}
