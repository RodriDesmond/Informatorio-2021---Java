package complementarios1;
import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args){
        System.out.println("Ingrese los datos a continuacion: ");

        Scanner scan = new Scanner(System.in);

        System.out.println("\nNombre y apellido: ");        
        String name = scan.nextLine();

        System.out.println("\nEdad: ");        
        String age = scan.nextLine();

        System.out.println("\nDireccion: ");        
        String address = scan.nextLine();

        System.out.println("\nCiudad: ");        
        String city = scan.nextLine();

        scan.close();

        System.out.println(city+" - "+ address+" - "+ age + " - " + name);
    }
}
