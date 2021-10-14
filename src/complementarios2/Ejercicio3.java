package complementarios2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

//Crear una lista que contenga como elementos la numeración de cartas de una baraja francesa (solo los valores, no figuras). 
//Se deberá cargar el ArrayList (en orden), imprimir, imprimir en orden inverso (reverse), desordenar (mezclar) el arrayList y volver a imprimir.

public class Ejercicio3 {
    public static void main(String[] args){
        ArrayList<String> baraja = new ArrayList<>();

        baraja.add("2");
        baraja.add("3");
        baraja.add("4");
        baraja.add("5");
        baraja.add("6");
        baraja.add("7");
        baraja.add("8");
        baraja.add("9");
        baraja.add("10");
        baraja.add("J");
        baraja.add("Q");
        baraja.add("K");
        baraja.add("A");

        System.out.println("\nBaraja ordenada: " + Arrays.asList(baraja));
        
        Collections.reverse(baraja);
        System.out.println("\nBaraja orden inverso: " + Arrays.asList(baraja));

        Collections.shuffle(baraja);
        System.out.println("\nBaraja desordenada:" + Arrays.asList(baraja));
            

        

        
    }
    
}
