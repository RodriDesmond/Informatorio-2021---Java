package complementarios1;

import java.util.Scanner;

public class Ejercicio1 {
    
    public static void main(String[] args){
        System.out.println("Ingrese su nombre de usuario: ");

        Scanner scan = new Scanner(System.in);        
        String user = scan.nextLine();

        scan.close(); 

        System.out.println("HOLA " + user);
    }
}
