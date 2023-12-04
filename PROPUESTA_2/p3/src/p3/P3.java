package p3;
import java.util.Scanner;
public class P3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de estudiantes:");
        int cantidadEstudiantes = scanner.nextInt();
        String mejorEgresado = "";
        double mejorPromedio = 0;

        for (int i = 1; i <= cantidadEstudiantes; i++) {
            System.out.println("Ingrese el nombre del estudiante " + i + ":");
            String nombre = scanner.next();

            System.out.println("Ingrese el promedio final del estudiante " + i + ":");
            double promedio = scanner.nextDouble();
            if (promedio > mejorPromedio) {
                mejorEgresado = nombre;
                mejorPromedio = promedio;
            } else if (promedio == mejorPromedio) {
                mejorEgresado += " y " + nombre;
            }
        }
        System.out.println("El mejor Egresado es: " + mejorEgresado + " con un promedio de " + mejorPromedio);
    }
}