package arrays;

import java.util.Scanner;

public class Ejercicio19 {
    public static void main(String[] args) {
        // verificar si un numero es primo o no
        // en caso sea primo imprimir es primo
        // caso contrario imprimer no es primo
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el valor a calcular");
        int numero = sc.nextInt();
        boolean isPrime = true;
        for(int i = 2; i<numero; i++)
        {
            if(numero%i==0)
            {
                isPrime = false;
                break;
            }
        }

        if(isPrime)
        {
            System.out.println("El numero es primo");
        }
        else {
            System.out.println("El numero no es primo");
        }
    }
}
