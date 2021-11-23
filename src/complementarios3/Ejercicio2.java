package complementarios3;

import java.util.List;

public class Ejercicio2 {
    public static void main(String[] args) {
        List<Integer> palabras = List.of(1, 2, 3, 4, 5);

        palabras.stream()
                .mapToInt(pow -> (int) Math.pow(pow,2))
                .forEach(System.out::println);
    }
}

