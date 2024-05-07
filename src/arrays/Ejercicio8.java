package arrays;

import java.util.ArrayList;
import java.util.Map;
import java.util.Random;

public class Ejercicio8 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();

        for(int i = 0; i < 10; i++)
        {
            Random random = new Random();
            numbers.add(random.nextInt(100));
        }
        System.out.println("++++++++++Orden Normal+++++++");
        for(int i = 0; i < numbers.size(); i++)
        {
            System.out.println(numbers.get(i));
        }
        // Declarar un arreglo de 10 elementos e imprimir la suma de sus valores.
        System.out.println("+++++++++Inverso++++++++++++");
        for(int i = numbers.size() - 1; i >= 0; i--)
        {
            System.out.println(numbers.get(i));
        }
    }
}
