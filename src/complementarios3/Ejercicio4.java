package complementarios3;

import java.util.List;
import java.util.stream.LongStream;

public class Ejercicio4 {
    public static void main(String[] args) {
        List<Integer> palabras = List.of(1, 2, 4, 4, 4);
        List<Integer> factoriales = palabras.stream()
            .distinct()
            .mapToInt(i -> (int) factorial(i))
            .boxed()
            .toList();
        System.out.println(factoriales);
    }

    public static long factorial(int n) {
        return LongStream.rangeClosed(1, n)
            .reduce(1, (long x, long y) -> x * y);
    }
}
