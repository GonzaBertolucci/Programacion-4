package Dominio;

import java.time.LocalDate;

public class Persona {
	
	// Atributos 
	private String dni;
	private String nombre;
	private String apellido;
	private LocalDate fechaNacimiento;
	private String genero;
	private String direccion;
	private String telefono;
	private String email;
	
	// Constructores 
	public Persona() {
	   this.nombre = "Sin nombre";
	   this.apellido = "Sin apellido";
	   this.genero = "Sin genero";
	   this.direccion = "Sin direccion";
	   this.telefono = "Sin telefono";
	   this.email = "Sin E-mail";
	   this.fechaNacimiento = LocalDate.of(2025, 1, 1);
	}
	
	public Persona(String dni, String nombre, String apellido, LocalDate fechaNacimiento, String genero, String direccion, String telefono, String email) {
		this.dni = dni;
		this.nombre = nombre;
		this.apellido = apellido;
		this.fechaNacimiento = fechaNacimiento;
		this.genero = genero;
		this.direccion = direccion;
		this.telefono = telefono;
		this.email = email;
	}
	
	
	// Métodos
	@Override
	public String toString() {
		return " Dni:" + dni + " Nombre:" + nombre + " Apellido:" + apellido + " Fecha de nacimiento:"
				+ fechaNacimiento + " \nGenero:" + genero + " Direccion:" + direccion + " Telefono:" + telefono
				+ " Email:" + email + "\n";
	}
	
	// Getters y Setters
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
	    if (dni != null && dni.matches("\\d{7,8}")) { 
	        this.dni = dni;
	    } else {
	        throw new IllegalArgumentException("DNI inválido. Debe contener 7 u 8 dígitos numéricos.");
	    }
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public LocalDate getFechaNacimiento() {
		return fechaNacimiento;
	}
	public void setFechaNacimiento(LocalDate fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
	    if (telefono != null && telefono.matches("\\d{7,15}")) {
	        this.telefono = telefono;
	    } else {
	        throw new IllegalArgumentException("Teléfono inválido. Debe contener solo números (7 a 15 dígitos).");
	    }
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	
	
	
	
	
}

