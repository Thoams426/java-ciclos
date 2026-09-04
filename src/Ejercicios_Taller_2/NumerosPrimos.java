package Ejercicios_Taller_2;
/*Ejercicio 3.b.10. Mostrar por pantalla todos los números primos que hay entre 1 y 200*/
public class NumerosPrimos {
    public static void main(String[] args) {
        System.out.println("Números primos entre 1 y 200");

        int cont = 0;
        for (int i = 2; i <= 200; i++) {
            boolean Primo = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    Primo = false; 
                    break;
                }
            }

             if (Primo) {
                System.out.print(i + " ");
                cont++;

                if (cont % 10 == 0) {
                    System.out.println();
   }}
        }
        System.out.println("Total de números primos encontrados: " + cont);}}
