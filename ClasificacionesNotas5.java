/**
 * @author Cando Campoverde Steven Josue
 */
package Estructura_Control;
import java.util.Scanner;

public class ClasificacionesNotas5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double nota;

        System.out.print("Ingrese una calificacion entre 0 y 10: ");
        nota = sc.nextDouble();

        if (nota < 0 || nota > 10) {
            System.out.println("Calificacion no valida");
        } else if (nota >= 9) {
            System.out.println("Excelente");
        } else if (nota >= 8) {
            System.out.println("Muy Bueno");
        } else if (nota >= 7) {
            System.out.println("Bueno");
        } else if (nota >= 5) {
            System.out.println("Regular");
        } else {
            System.out.println("Deficiente");
        }

        sc.close();
    }
}
