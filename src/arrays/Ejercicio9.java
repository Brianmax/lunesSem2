package arrays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Ejercicio9 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        for(int i = 0; i < 100; i++) // 10 son los elementos del array
        {
            Random random = new Random();
            numbers.add(random.nextInt(100));
            // random.nextInt: genera un valor aleatorio entre 0 y 100
        }

        System.out.println("++++++++++Elementos array+++++++");
        int suma = 0;
        for(int i = 0; i < numbers.size(); i++)
        {
            suma = suma + numbers.get(i);
            System.out.println(numbers.get(i));
        }

        Collections.sort(numbers);
        System.out.println("La suma es: " + suma);
    }
}
