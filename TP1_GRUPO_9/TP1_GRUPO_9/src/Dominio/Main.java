package Dominio;

import java.time.LocalDate;

public class Main {

	public static void main(String[] args) {	

		Empleado[] vEmpleados = new Empleado[5]; 
		
		vEmpleados[0] = new Empleado();
		vEmpleados[1] = new Empleado();	
		vEmpleados[2] = new Empleado();
		vEmpleados[3] = new Empleado("30111222", "Sofía", "Martínez",LocalDate.of(1987, 3, 12),"Femenino", "Av. Roca 1200", "1161234567", "sofia.martinez@mail.com", "Administrativa");
		vEmpleados[4] = new Empleado("31222333", "Camila", "Ríos", LocalDate.of(1985, 11, 5),"Femenino", "Boulevard Oroño 900", "1144455566", "camila.rios@mail.com", "Diseñadora gráfica");
		
		
		for (Empleado empl : vEmpleados) {
			System.out.println(empl.toString());
		}

		System.out.println("El siguiente legajo es " + Empleado.DevuelveProximoLegajo());
		
	}
}
