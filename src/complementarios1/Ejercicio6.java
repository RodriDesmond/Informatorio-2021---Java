package complementarios1;

import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("A continuacion ingrese base y exponente para calcular la potencia: ");

        System.out.println("Ingrese la base: ");
        int base = scan.nextInt();

        System.out.println("Ingrese el exponente: ");
        int expo = scan.nextInt();

        scan.close();

        int potencia;
        potencia = 1;

        for (int i=1; i<=expo; i++) {
            potencia = potencia*base;
        }

        System.out.println(base+" elevado a "+expo +" es igual a: "+ potencia);
    }
}
