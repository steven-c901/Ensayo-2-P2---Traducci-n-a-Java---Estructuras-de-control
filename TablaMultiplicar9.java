/**
 * @author Tu Nombre Completo
 */
package Estructura_Control;
import java.util.Scanner;

public class TablaMultiplicar9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numero;

        System.out.print("Ingrese un numero entero: ");
        numero = sc.nextInt();

        System.out.println("= TABLA DE MULTIPLICAR =");

        for (int i = 1; i <= 12; i++) {
            System.out.println(numero + " x " + i + " = " + (numero * i));
        }

        sc.close();
    }
}