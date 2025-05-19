import java.util.Scanner;
public class Paciente {
    String nombre;
    int edad;
    String nroExpediente;

    public void guardarDatos() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa los datos del paciente:");

        System.out.print("Nombre: Hannia");
        nombre = scanner.nextLine();

        System.out.println("Edad: 24");
        edad = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Número de expediente: 1111");
        nroExpediente = scanner.nextLine();

    }

    public void mostrarInformacion() {
        System.out.println("Datos del paciente: \nNombre: " + nombre + "\nEdad: " + "\nNúmero de expediente: ");
    }
}