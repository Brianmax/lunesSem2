package arrays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Ejercicio16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> tiemposLectura = new ArrayList<>();
        System.out.println("Ingrese el numero de libros");
        int numLibros = sc.nextInt();
        System.out.println("Ingrese el tiempo libre");
        int tiempoLibre = sc.nextInt(); // tiempo libre

        for (int i = 0; i < numLibros; i++) {
            System.out.println("Ingrese el tiempo de lectura para el libro" + i);
            int tiempo = sc.nextInt();
            tiemposLectura.add(tiempo);
        }

        Collections.sort(tiemposLectura); // ordenando el array

        int librosLeidos = 0;
        for (int i = 0; i < tiemposLectura.size(); i++)
        {
            if(tiempoLibre >= tiemposLectura.get(i))
            {
                librosLeidos++;
            }
            else {
                break;
            }
            tiempoLibre -= tiemposLectura.get(i);
        }
        System.out.println("Maxima cantidad: " + librosLeidos);
    }
}
