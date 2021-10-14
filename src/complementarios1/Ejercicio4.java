package complementarios1;

import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {

        System.out.println("Ingrese un numero entero: ");

        Scanner scan = new Scanner(System.in);        
        int a = scan.nextInt();
        scan.close();
        System.out.println("El factorial de " + a + " es: " + factorial(a));

    }

    public static int factorial(int a) {
        int fact = 1;
        for (int i = 1; i <= a; i++) {
            fact *= i;
        }

        return fact;
    }
}
