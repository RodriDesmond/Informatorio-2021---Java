package complementarios2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args){
        ArrayList<Float> horasTrabajadas = new ArrayList<>();
        ArrayList<Float> valorHora = new ArrayList<>();
        ArrayList<Float> totalesList = new ArrayList<>();

        System.out.println("\nIngresar horas trabajadas de cada dia: ");

        Scanner scan = new Scanner(System.in);        

        System.out.println("\nLunes: ");
        horasTrabajadas.add(scan.nextFloat());        
        System.out.println("\nMartes:");
        horasTrabajadas.add(scan.nextFloat());
        System.out.println("\nMiercoles:");
        horasTrabajadas.add(scan.nextFloat());
        System.out.println("\nJueves: ");
        horasTrabajadas.add(scan.nextFloat());
        System.out.println("\nVirnes: ");
        horasTrabajadas.add(scan.nextFloat());

        System.out.println("\nIngresar el valor por hora de trabajo de cada dia: ");

        System.out.println("\nLunes: ");
        valorHora.add(scan.nextFloat());      
        System.out.println("\nMartes:");
        valorHora.add(scan.nextFloat());
        System.out.println("\nMiercoles:");
        valorHora.add(scan.nextFloat());
        System.out.println("\nJueves: ");
        valorHora.add(scan.nextFloat());
        System.out.println("\nVirnes: ");
        valorHora.add(scan.nextFloat());

        scan.close();

        float suma = 0;
        for (int i = 0; i < horasTrabajadas.size(); i++){
            totalesList.add(horasTrabajadas.get(i) * valorHora.get(i));
            suma = suma + totalesList.get(i);
        }
        
        System.out.println("\nEstudiantes: " + Arrays.asList(totalesList));
        System.out.println("\nTotal Final: $" + suma);    
        
    }
    
}
