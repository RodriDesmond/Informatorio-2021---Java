package complementarios3;

import java.time.LocalDate;
import java.time.Period;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Ejercicio5 {
    public static void main(String[] args) {
        List<Alumno> alumnos = List.of(
                new Alumno("Homero", "Simpson", LocalDate.of(1984, 5, 12)),
                new Alumno("Bart", "Simpson", LocalDate.of(2011, 2, 26)),
                new Alumno("Lisa", "Simpson", LocalDate.of(2013, 4, 20)),
                new Alumno("Maggie", "Simpson", LocalDate.of(2019, 3, 19)),
                new Alumno("March", "Simpson", LocalDate.of(1986, 4, 19))
        );
        Map<String, Integer> alumnosMap = alumnos.stream()
                .collect(Collectors.toMap((a) -> (a.getLastName()+" "+a.getName()), (a) -> age(LocalDate.now(),a.getBirthDate())));
        System.out.println(alumnosMap);
    }
    public static int age(LocalDate today, LocalDate birthday) {
        Period p = Period.between(birthday, today);
        Integer age = p.getYears();
        return age;
    }
}
