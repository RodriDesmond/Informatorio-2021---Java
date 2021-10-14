package complementarios1;

import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        System.out.println("Ingrese un string: ");

        Scanner scan = new Scanner(System.in);        
        String palabra = scan.nextLine();
        scan.close();        

        String upperCase = "";
        int n;
        char letra;

        for (int i = 0; i<palabra.length(); i++) {
    	    letra = palabra.charAt(i);

            if (letra >= 97 && letra<= 122) //Si el valor del caracter en ASCII esta entre 97 y 122 se le resta 32, que es la misma letra en mayuscula
			{
				n = letra - 32;
				letra = (char) n;
			}
            upperCase = upperCase + letra;
        }
        System.out.println("\nUpper Case: " + upperCase);
		upperCase = "";     
             
    }
}
