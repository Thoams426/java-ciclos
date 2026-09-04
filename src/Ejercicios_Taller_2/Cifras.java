package Ejercicios_Taller_2;
/*Ejercicio 3.c.2.Encontrar y mostrar todos los números de cuatro cifras que cumplan la condición de que la suma de
las cifras de orden impar es igual a la suma de las cifras de orden par.*/
public class Cifras {
    public static void main(String[] args) {
        for (int i=1000;i<=9999;i++){
        String numTex = String.valueOf(i);
        int d4 = numTex.charAt(0) - '0';
        int d3 = numTex.charAt(1) - '0';
        int d2 = numTex.charAt(2) - '0';
        int d1 = numTex.charAt(3) - '0';
        
        if ((d1 + d3) == (d2 + d4)) {
    System.out.println(i);
    
}
        
    }
    System.out.println("Estos son todos los números de 4 cifras cuya suma de cifras de orden impar es igual a las de orden par ");
    }}
