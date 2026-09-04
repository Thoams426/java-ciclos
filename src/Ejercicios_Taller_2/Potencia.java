package Ejercicios_Taller_2;
/*Ejercicio 3.b.3. Escribir un programa que pida una base y un exponente (ambos números son enteros positivos) y que
calcule la potencia. Ejemplo, si se indica 3 y 4, nos da 81 de solución (3 elevado a 4, es 3*3*3*3).*/
import java.util.Scanner;
public class Potencia {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int b, exp;
        do {
            System.out.print("Introduce la base (tiene que ser entero positivo): ");
            b = sc.nextInt();
            if (b < 0) {
                System.out.println("Error: La base debe ser mayor o igual a 0.");
            }
        } while (b < 0);

        do {
            System.out.print("Introduce el exponente (tambien debe ser entero positivo): ");
            exp = sc.nextInt();
            if (exp < 0) {
                System.out.println("Error: El exponente debe ser mayor o igual a 0.");
            }
        } while (exp < 0);
        long resultado = 1;

        for (int i = 1; i <= exp; i++) {
            resultado *= b;
        }
        System.out.println("\n" + b + " elevado a la " + exp + " es igual a: " + resultado);}}
