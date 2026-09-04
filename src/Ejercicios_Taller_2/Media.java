package Ejercicios_Taller_2;
/*Ejercicio 3.b.1. Programa que pide por teclado 5 números, y en el caso en el que el primero introducido sea igual al
último, nos muestra la media de ambos. En caso contrario, no se mostrará nada.*/
import java.util.Scanner;
public class Media {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int primerNum = 0;
        int ultimoNum = 0;
        for (int i = 1; i <= 5; i++) {
            System.out.print("Introduce el número " + i + ": ");
            int num = sc.nextInt();
            if (i == 1) {
                primerNum = num;
            }
            if (i == 5) {
                ultimoNum = num;
            }
        }
        if (primerNum == ultimoNum) {
            double media = (primerNum+ ultimoNum) / 2.0;
            System.out.println("El primero y el último número son iguales.");
            System.out.println("La media de ambos es: " + media);
        }
    }}
