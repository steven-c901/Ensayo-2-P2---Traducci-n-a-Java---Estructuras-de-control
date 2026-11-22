/**
 * @author Tu Nombre Completo
 */
package Estructura_Control;
import java.util.Scanner;

public class ValidarContrasena8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String contrasena;

        System.out.print("Ingrese la contraseña: ");
        contrasena = sc.nextLine();

        while (!contrasena.equals("java2026")) {
            System.out.print("Contraseña incorrecta. Intente nuevamente: ");
            contrasena = sc.nextLine();
        }

        System.out.println("Acceso concedido.");

        sc.close();
    }
}