package Ejercicio1;

import java.time.LocalDate;

public class Empleado extends Persona implements Comparable<Empleado> {
	
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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + legajo;
		result = prime * result + ((puesto == null) ? 0 : puesto.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Empleado other = (Empleado) obj;
		if (legajo != other.legajo)
			return false;
		if (puesto == null) {
			if (other.puesto != null)
				return false;
		} else if (!puesto.equals(other.puesto))
			return false;
		return true;
	}

	@Override
	public int compareTo(Empleado o) {
		// TODO Auto-generated method stub
		if(o.legajo == this.legajo)
		return 0;
	
		if(o.legajo<this.legajo) {
			return -1;
		}
		
		return 1;
	}
	
}
