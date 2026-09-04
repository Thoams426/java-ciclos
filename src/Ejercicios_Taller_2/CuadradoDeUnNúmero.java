package Ejercicios_Taller_2;

/*Ejercicio 3.a.13.Pedir por teclado un número y mostrar su cuadrado, repetir el proceso hasta que se introduzca un
número negativo.*/
import java.util.Scanner;
public class CuadradoDeUnNúmero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;

        System.out.println("Ingresa un número positivo para calcular su cuadrado.");
        System.out.println("Ingresa un número negativo para salir.");

        System.out.print("Ingrese un número: ");
        num = sc.nextInt();
        while (num >= 0) {
            int cuadrado = num * num;
            System.out.println("El cuadrado de " + num + " es: " + cuadrado);

            System.out.print("Introduce otro número (negativo para salir): ");
            num = sc.nextInt();
        }

        System.out.println("Se ha ingresado un número negativo. Finalizando Programa");
    }
}
