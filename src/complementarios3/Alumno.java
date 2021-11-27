package complementarios3;

import java.time.LocalDate;
public class Alumno {
    private String name;
    private String lastName;
    private LocalDate birthDate;
    public Alumno(String name, String lastName, LocalDate birthDate) {
        this.name = name;
        this.lastName = lastName;
        this.birthDate = birthDate;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public LocalDate getBirthDate() {
        return birthDate;
    }
    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }
}
