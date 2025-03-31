package ec.edu.ups.poo.principal;

import ec.edu.ups.poo.clases.Persona;
import ec.edu.ups.poo.clases.Familiar;

import java.util.Scanner;
import java.util.GregorianCalendar;

public class Principal {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        //System.out.println("COMENTARIO");CAMBIO DE MATEO MOLINA
        //System.out.println();Segundo comentario de Mateo Molina
        System.out.print("Ingrese el número de personas: ");
        int numPersonas = leer.nextInt();
        System.out.print("Ingrese el número de familiares: ");
        int numFamiliares = leer.nextInt();
        leer.nextLine(); // Limpiar buffer

        Persona[] personas = new Persona[numPersonas];
        Familiar[] familiares = new Familiar[numFamiliares];

        // Ingreso de personas
        for (int i = 0; i < numPersonas; i++) {
            Persona persona = new Persona();
            System.out.printf("\nPersona %d\n", i + 1);
            System.out.print("Ingrese el número de cédula: ");
            String cedula = leer.nextLine();
            System.out.print("Ingrese el nombre: ");
            String nombres = leer.nextLine();
            System.out.print("Ingrese el apellido: ");
            String apellidos = leer.nextLine();
            System.out.print("Ingrese la dirección: ");
            String direccion = leer.nextLine();

            persona.setCedula(cedula);
            persona.setNombres(nombres);
            persona.setApellidos(apellidos);
            persona.setDireccion(direccion);
            personas[i] = persona;
        }

        // Ingreso de familiares
        for (int i = 0; i < numFamiliares; i++) {
            Familiar familiar = new Familiar();
            System.out.printf("\nFamiliar %d\n", i + 1);
            System.out.print("Ingrese el número de cédula: ");
            String cedula = leer.nextLine();
            System.out.print("Ingrese el nombre: ");
            String nombres = leer.nextLine();
            System.out.print("Ingrese el apellido: ");
            String apellidos = leer.nextLine();
            System.out.print("Ingrese la dirección: ");
            String direccion = leer.nextLine();
            System.out.print("Ingrese el parentesco: ");
            String parentesco = leer.nextLine();
            System.out.print("Ingrese el tipo de sangre: ");
            String tipoSangre = leer.nextLine();

            System.out.println("Ingrese la fecha de nacimiento:");
            System.out.print("Año: ");
            int year = leer.nextInt();
            System.out.print("Mes: ");
            int mes = leer.nextInt();
            System.out.print("Día: ");
            int dia = leer.nextInt();
            leer.nextLine(); // Limpiar buffer
            GregorianCalendar fechaNacimiento = new GregorianCalendar(year, mes, dia);

            familiar.setCedula(cedula);
            familiar.setNombres(nombres);
            familiar.setApellidos(apellidos);
            familiar.setDireccion(direccion);
            familiar.setParentesco(parentesco);
            familiar.setTipoSangre(tipoSangre);
            familiar.setFechaDeNacimiento(fechaNacimiento);
            familiares[i] = familiar;
        }

        // Mostrar datos de personas
        System.out.println("\n===== Datos de Personas =====");
        for (int i = 0; i < numPersonas; i++) {
            System.out.println("\nPersona " + (i + 1));
            System.out.println(personas[i]);
        }
        // Mostrar datos de familiares
        System.out.println("\n===== Datos de Familiares =====");
        for (int i = 0; i < numPersonas; i++) {
            System.out.println("\nFamiliar " + (i + 1));
            System.out.println(familiares[i]);
        }
    }
}