package complementarios3;


import java.util.List;
import java.util.stream.Collectors;

public class Ejercicio2 {
    public static void main(String[] args) {
        List<Integer> palabras = List.of(1, 2, 3, 4, 5);
        List<Integer> potencias = palabras.stream()
            .mapToInt(pow -> (int) Math.pow(pow, 2))
            .boxed()
            .toList();
        System.out.println(potencias);
    }

}
