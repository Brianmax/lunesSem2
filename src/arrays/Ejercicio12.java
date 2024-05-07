package arrays;

public class Ejercicio12 {
    public static void main(String[] args) {
        String texto = "Java es un lenguaje de programacion";
        char letra = 'a';
        int ocurrencias = 0;
        for(int i = 0; i < texto.length(); i++)
        {
            if(texto.charAt(i) == letra)
            {
                ocurrencias++;
            }
        }
        System.out.println("El numero de veces que se repite es: " + ocurrencias);
    }
}
