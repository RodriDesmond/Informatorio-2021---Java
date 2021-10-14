package complementarios2;

import java.util.ArrayList;
import java.util.Scanner;

//Crear un ArrayList, agregar 5 números enteros. 
//Luego, agregar un número entero al principio de la lista y otro al final. 
//Por último, iterar e imprimir los elementos de la lista y el tamaño de la misma (antes y después de agregar a en la primera y última posición).

public class Ejercicio2 {
    public static void main(String[] args){
        ArrayList<Integer> numeros = new ArrayList<>();
        Scanner scan = new Scanner(System.in);        

        for (int i = 0; i < 5; i++){
            System.out.println("\nIngresar un numero entero: ");
            numeros.add(scan.nextInt());
        }

        System.out.println("\nElementos en la lista: ");
        for (int i = 0; i < 5; i++){
            System.out.print(numeros.get(i)+", ");
        }

        System.out.println("\nTamaño de la lista: " + (numeros.size()));

        System.out.println("\nIngresar un numero entero al principio de la lista: ");
        numeros.add(0, scan.nextInt());

        System.out.println("\nIngresar un numero entero al final de la lista: ");
        numeros.add(scan.nextInt());

        scan.close();

        System.out.println("\nElementos en la lista: ");
        for (int i = 0; i < numeros.size(); i++){
            System.out.print(numeros.get(i)+", ");
        }

        System.out.println("\nTamaño de la nueva lista " + (numeros.size()));    
    }
}
