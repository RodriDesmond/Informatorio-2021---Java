package complementarios3;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Ejercicio1 {
    public static void main(String[] args) {
        List<String> palabras = new ArrayList<>();
        palabras.add("Hola");
        palabras.add(null);
        palabras.add("Informatorio");
        palabras.add("");
        palabras.stream()
                .filter(Objects::nonNull)
                .forEach(System.out::println);
    }
}
