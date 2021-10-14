package complementarios1;

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args){
        System.out.println("Ingrese un numero entero: ");

        Scanner scan = new Scanner(System.in);        
        int a = scan.nextInt();
        scan.close();
        String cadena = "";

        for (int i = 1; i <= a; i++) {
            String secuencia = i+" ";
            cadena = cadena+secuencia;
            System.out.println(cadena);
          }
    }
                

}
