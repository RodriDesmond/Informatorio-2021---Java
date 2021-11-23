package complementarios3;
import java.util.List;

public class Ejercicio3 {
    public static void main(String[] args) {
        List<String> palabras = List.of("Batman", "Aquaman", "Flash", "Batgirl", "Wonder Woman", "brainiac");
        long i = palabras.stream()
                .filter(dc -> dc.toLowerCase().startsWith("b") )
                .count();
        System.out.print(i);
    }
}
