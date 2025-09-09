package Ejercicio1;
import java.time.LocalDate;
import java.util.TreeSet;
import java.util.Iterator;
public class MainEjercicio1_c {

	public static void main(String[] args) {
        TreeSet<Empleado> ListaEmpleados = new TreeSet<Empleado>();
        Empleado emp1 = new Empleado("30111222", "Sofía", "Martínez",LocalDate.of(1987, 3, 12),"Femenino", "Av. Roca 1200", "1161234567", "sofia.martinez@mail.com", "Administrativa");
        Empleado emp2 = new Empleado("31222333", "Camila", "Ríos", LocalDate.of(1985, 11, 5),"Femenino", "Boulevard Oroño 900", "1144455566", "camila.rios@mail.com", "Diseñadora gráfica");
        Empleado emp3 = new Empleado("22222222" , "Martin", "Marquez", LocalDate.of(1985, 2, 12), "Masculino", "Libertador 122", "2222222222" , "mm@Gmail.com", "Diseñador");
        Empleado emp4 = new Empleado("33333333" , "Martin1", "Marquez1", LocalDate.of(1985, 2, 10), "Masculino", "Libertador 12", "3333333333" , "mm2@Gmail.com", "Diseñador");
        Empleado emp5 = new Empleado("44444444" , "Martin2", "Marquez2", LocalDate.of(1985, 2, 9), "Masculino", "Libertador 2", "4444444444" , "mm1@Gmail.com", "Diseñador");
        
        ListaEmpleados.add(emp1);
        ListaEmpleados.add(emp2);
        ListaEmpleados.add(emp3);
        ListaEmpleados.add(emp4);
        ListaEmpleados.add(emp5);
        
        Iterator<Empleado> it = ListaEmpleados.iterator();
        while(it.hasNext()) {
        	Empleado emp = (Empleado) it.next();
        	System.out.println(emp.toString());
        }
	}

}
