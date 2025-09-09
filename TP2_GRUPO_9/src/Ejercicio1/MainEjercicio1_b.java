package Ejercicio1;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.ListIterator;

public class MainEjercicio1_b {
    public static void main(String[] args) {
    	
    	//Arraylist para almacenar un objeto de Empleado
        ArrayList<Empleado> empleados = new ArrayList<>();
        
        //Agrego los 5 empleados al Arraylist
        empleados.add(new Empleado("20202020", "Ana", "Paz", LocalDate.of(1998, 5, 2), "Femenino", "Av. Siempre Viva 123", "1122334455", "ana@mail.com", "Desarrolladora"));
        
        empleados.add(new Empleado("20300300", "Bruno", "Sosa", LocalDate.of(1997, 11, 15), "Masculino", "Belgrano 450", "1144556677", "bruno@mail.com", "QA"));
        
        empleados.add(new Empleado("33111222", "Carla", "Mendez", LocalDate.of(2000, 1, 9), "Femenino", "Mitre 900", "1177788899", "carla@mail.com", "Soporte"));
        
        empleados.add(new Empleado("35999888", "Diego", "Ramos", LocalDate.of(1996, 3, 28), "Masculino", "San Martín 250", "1199911122", "diego@mail.com", "DevOps"));
        
        empleados.add(new Empleado("40123456", "Elena", "Gómez", LocalDate.of(1999, 7, 4), "Femenino", "Rivadavia 700", "1133344455", "elena@mail.com", "UX"));

        System.out.println("Listado de empleados:");
        
        //Se crea un ListIterator para recorrer el arraylist
        ListIterator<Empleado> it = empleados.listIterator();
        //Recorre la lista mientras haya un siguiente elemento
        while (it.hasNext()) {
            Empleado e = it.next();
            System.out.println(e.toString());
        }
    }
}