package complementarios2;

public class Empleados {
    private String name;
    private int dni;
    private float horasTrabajadas;
    private float valorPorHora;
    Empleados(String name, int dni, float horasTrabajadas, float valorPorHora){
        this.name = name;
        this.dni = dni;
        this.horasTrabajadas = horasTrabajadas;
        this.valorPorHora = valorPorHora;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public int getDni(){
        return dni;
    }
    public void setDni(int dni){
        this.dni = dni;
    }
    public float getHorasTrabajadas(){
        return horasTrabajadas;
    }
    public void setHorasTrabajadas(float horasTrabajadas){
        this.horasTrabajadas = horasTrabajadas;
    }

    public float getValorPorHora(){
        return valorPorHora;
    }

    public void setValorPorHora(float valorPorHora){
        this.valorPorHora = valorPorHora;
    }


}
