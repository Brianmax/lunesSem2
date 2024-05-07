package arrays;

import com.sun.source.tree.ArrayAccessTree;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;

public class Array {
    public static void main(String[] args) {
        int[] primerArray = new int[5];
        int[] notas = new int[20];

        int[] precios = {1,2,4,5,2,122,3};
        notas[0] = 12;
        notas[1] = 14;
        ArrayList<String> libros = new ArrayList<>();
        libros.add("Abril rojo"); // 0 // eliminado
        libros.add("El mundo que vimos arder"); // 0
        libros.add("Tradiciones peruanas"); // 1

        // libros.remove(0);
        // System.out.println(libros.get(2));
        System.out.println("Hello");

        // recorriendo un array

        for(int i = 0; i < libros.size(); i++)
        {
            System.out.println(libros.get(i));
        }
    }
}
