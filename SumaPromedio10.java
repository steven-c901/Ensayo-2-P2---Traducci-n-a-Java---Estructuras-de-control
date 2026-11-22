/**
 * @author Tu Nombre Completo
 */
package Estructura_Control;
import java.util.Scanner;

public class SumaPromedio10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numero;
        int suma = 0;
        double promedio;

        for (int i = 1; i <= 10; i++) {
            System.out.print("Ingrese el numero " + i + ": ");
            numero = sc.nextInt();

            suma += numero;
        }

        promedio = suma / 10.0;

        System.out.println("Suma: " + suma);
        System.out.println("Promedio: " + promedio);

        sc.close();
    }
}
