package Ejercicios_Taller_2;
import java.util.Scanner;
/*Ejercicio 3.c.1.Pedir por teclado un número y calcular su factorial. Si el número introducido es negativo se seguirá
pidiendo hasta que sea positivo.*/
public class Factorial {
    public static void main(String[] args) {
       Scanner sc = new Scanner (System.in);{
            int num;
            do {
                System.out.print("Introduce un número entero no negativo: ");
                num = sc.nextInt();
                
                if (num < 0) {
                    System.out.println("Error: El número debe ser positivo o cero. Inténtalo de nuevo.");
                }
            } while (num < 0);
            long factorial = 1;

            for (int i = 1; i <= num; i++) {
                factorial *= i;
            }
            System.out.println("El factorial de " + num + " es: " + factorial);
        }
    }
}
