package Ejercicios_Taller_2;
/*Ejercicio 3.a.10.Escribe un programa que muestre, cuente y sume los múltiplos de 3 que hay entre 1 y un número
leído por teclado.*/
import java.util.Scanner;
public class MultiplosDeTres {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingresa un número entero positivo: ");
        int num = sc.nextInt();
        int cont = 0;
        int suma = 0;
        System.out.println("\nLos múltiplos de 3 entre 1 y " + num + " son:");
        for (int i = 1; i <= num; i++) {
           
            if (i % 3 == 0) {
                System.out.print(i + " ");
                cont++; 
                suma += i;    
            }}
        System.out.println("Cantidad de múltiplos encontrados: " + cont);
        System.out.println("Suma total de los múltiplos: " + suma);

        }}
