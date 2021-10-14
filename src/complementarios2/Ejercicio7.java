package complementarios2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Ejercicio7 {

    /*
     * Crear una función que dado 2 argumentos (int, siendo el primero menor al
     * segundo), nos devuelva un array de Strings. Con la secuencia de números
     * enteros de principio a final. Pero si el número es multiplo de 2 colocara el
     * valor “Fizz”, si es múltiplo de 3 “Buzz” y si es a la vez múltiplo de ambos
     * colocara “FizzBuzz”.
     * 
     * Observacion: Los 2 argumentos indican con que valor se arranca a calcular y
     * el segundo con qué valor debe frenar (no se incluye en el cálculo) Ejemplo:
     * (1, 5) ----> calculará valores de 1, 2, 3, 4
     */

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Ingresar un numero entero: ");
        int x = scan.nextInt();

        System.out.println("\nIngresar otro numero entero, mayor al anterior: ");

        int y = scan.nextInt();

        while(y <= x){
            System.out.println("\nIngresar un numero entero, MAYOR! al anterior: ");        
            y = scan.nextInt();
        }

        scan.close();

        fizzBuzzFuncion(x,y);
    }

    public static Integer fizzBuzzFuncion(Integer x, Integer y) {

        List<String> secuenciaList = new ArrayList<String>();

        for (int i = (x - 1); i < y; i++) {

            if (i == x || i == (y - 1)) {

                secuenciaList.add(String.valueOf(i));

            } else if (i % 3 == 0 && i % 2 == 0) {

                secuenciaList.add("FizzBuzz");

            } else if (i % 2 == 0) {

                secuenciaList.add("Fizz");

            } else if (i % 3 == 0) {

                secuenciaList.add("Buzz");

            } else {

                secuenciaList.add(String.valueOf(i));

            }
        }
        
        System.out.println(Arrays.asList(secuenciaList));        

        return x;
    }
}
