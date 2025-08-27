package Dominio;

import java.time.LocalDate;

public class Empleado extends Persona {
	
	// Atributos
	
	private final int legajo;
	private String puesto;
	
	// Variables Estáticas
	
	static int ContadorLegajo = 999;
	 
	// Constructores
	public Empleado() {
		super();
		ContadorLegajo++;
		this.legajo = ContadorLegajo;
	}
	
	public Empleado(String dni, String nombre, String apellido, LocalDate fechaNacimiento,
					String genero, String direccion, String telefono, String email, String puesto) {
		
		super(dni, nombre, apellido, fechaNacimiento, genero, direccion, telefono, email);
		this.puesto = puesto;
		ContadorLegajo++;
		this.legajo = ContadorLegajo;
	}
	
	public static int DevuelveProximoLegajo() {
		return ContadorLegajo+1;
	}
	
	// Getters y Setters
	public int getLegajo() {
		return legajo;
	}
	public String getPuesto() {
		return puesto;
	}
	public void setPuesto(String puesto) {
		this.puesto = puesto;
	}
	
	// Metodo toString()
	@Override
	public String toString() {
		return "Legajo del empleado:" + legajo + " Puesto:" + puesto + super.toString() ;
	}
	
}
