package complementarios2;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/*Se dispone de una colección de Empleados, de cada empleado se conoce:
    Nombre y Apellido
    DNI
    horasTrabajadas
    valorPorHora
 Todos los empleados están cargados en un Set (HashSet), 
se desea calcular el sueldo (horasTrabajadas x valorPorHora) de toda esa lista para luego almacenar en un Map (o Diccionario) donde 
la clave (key) es el dni y el valor (value) es el sueldo calculado.*/


public class Ejercicio6 {
    public static void main(String[] args){

        Map<Integer, Float> sueldo = new HashMap<>();
        Set<Empleados> empleadoHashSet = new HashSet<>();

        Empleados empleado1 = new Empleados("Empleado Uno", 30400999, 45, 5);
        Empleados empleado2 = new Empleados("Empleado Dos", 30600999, 45, 8);
        Empleados empleado3 = new Empleados("Empleado Tres", 30500999, 45, 11);        
        
        empleadoHashSet.add(empleado1);
        empleadoHashSet.add(empleado2);
        empleadoHashSet.add(empleado3);   

        //System.out.println(empleado1.getName());
        
        System.out.println("Lista de Empleados: ");
        for (Empleados empleado : empleadoHashSet) { 
            System.out.println("\nNombre y apellido: " + empleado.getName() + "\nDNI: " + empleado.getDni() + "\nHoras trabajadas: " + empleado.getHorasTrabajadas() + "hs.\nValor de la hora de trabajo: $" + empleado.getValorPorHora());

            sueldo.put(empleado.getDni(), (empleado.getHorasTrabajadas() * empleado.getValorPorHora()));

        }
        
        // Iterador Map
        Iterator<Map.Entry<Integer, Float>> i = sueldo.entrySet().iterator();
        
        System.out.println("\nSueldo a cobrar: ");
        while(i.hasNext())
        {
             Map.Entry<Integer, Float> entry = i.next();
             System.out.println("DNI: " + entry.getKey() +
                                 ", Sueldo: $" + entry.getValue());
        }
    }

}
