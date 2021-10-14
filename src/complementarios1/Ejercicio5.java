package complementarios1;

import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        System.out.println("Ingrese 2 numeros enteros: ");

        Scanner scan = new Scanner(System.in);        
        int a = scan.nextInt();
        int b = scan.nextInt();
        scan.close();
        
        int producto;
        producto = 0;

        System.out.println("Suma sucesiva:");
        System.out.println();
        for (int i=1; i<=a; i++) {
            System.out.print(i+": ");
            producto=producto+b;
            System.out.println(producto);
        }
        System.out.println("Valor de la multiplicacion por suma suceciva: " + producto);
    }
}
