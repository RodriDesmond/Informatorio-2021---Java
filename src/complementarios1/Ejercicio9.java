package complementarios1;

import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in); 

        System.out.println("Ingrese un String (frase, texto, etc): ");               
        String s = scan.nextLine();

        System.out.println("\nIngrese 1(una) letra : ");
        String letra = scan.next();

        scan.close();

        int n = 0;

        for (int i = 0; i<s.length(); i++) {
    	    if ((s.toLowerCase()).charAt(i) == letra.toLowerCase().charAt(0)){
                n++;
            }
        }        
        System.out.println(n);
    }
}
