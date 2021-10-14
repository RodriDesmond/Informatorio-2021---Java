package complementarios2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Ejercicio4 {
    public static void main(String[] args){
        ArrayList<String> estudiantes = new ArrayList<>();

        for (int i = 0; i < 12; i++){
            estudiantes.add("Estudiante " + (i+1));
        }        

        List<String> curso1 = estudiantes.subList(0,4);
        List<String> curso2 = estudiantes.subList(4,8);
        List<String> curso3 = estudiantes.subList(8,12);
        
        System.out.println("\nEstudiantes: " + Arrays.asList(estudiantes));
        System.out.println("\nCurso 1: " + Arrays.asList(curso1));
        System.out.println("\nCurso 2: " + Arrays.asList(curso2));
        System.out.println("\nCurso 3: " + Arrays.asList(curso3));

    }
    
}
