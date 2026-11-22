/**
 * @author Cando Campoverde Steven Josue
 */package Estructura_Control;
import java.util.Scanner;

public class Estudiante4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        double nota;

        System.out.print("Ingrese la nota del estudiante: ");
        nota = sc.nextDouble();

        if (nota >= 0 && nota <= 10) {
            if (nota >= 7) {
                System.out.println("Aprobado");
            } else {
                System.out.println("Reprobado");
            }
        } else {
            System.out.println("Nota no valida. Ingrese una nota entre 0 y 10.");
        }

        sc.close();
    }
}
