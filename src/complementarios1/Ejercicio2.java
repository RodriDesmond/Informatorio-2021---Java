package complementarios1;

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args){
        System.out.println("Ingrese 2 numeros enteros: ");

        Scanner scan = new Scanner(System.in);        
        int a = scan.nextInt();
        int b = scan.nextInt();
        
        System.out.println(a+" + "+b+" = "+(a+b));
        System.out.println(a+" - "+b+" = "+(a-b));
        System.out.println(a+" * "+b+" = "+(a*b));
        System.out.println((a+" / "+b+" = "+(a/b)));
        System.out.println((a+" % "+b+" = "+(a%b)));


        scan.close();            
    }
}
