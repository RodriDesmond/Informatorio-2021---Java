package complementarios2;

import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args){
        ArrayList<String> cities = new ArrayList<>();

        Scanner scan = new Scanner(System.in);        

        String continuar="";

        while (!(continuar.toLowerCase()).equals("no")){

            System.out.println("\nIngresar una Ciudad: ");
            cities.add(scan.nextLine());
            System.out.println("\nContinuar ingresando cuidades?");
            continuar = scan.nextLine();

            while (!(continuar.toLowerCase()).equals("no") && !(continuar.toLowerCase()).equals("si")){
                System.out.println("\nIngresar si o no");
                continuar = scan.nextLine();
            }            
        }
        scan.close();     
        
        for (int i = 0; i < cities.size(); i++){
            System.out.println("#"+(i+1)+" "+cities.get(i));
        }

    }
}

