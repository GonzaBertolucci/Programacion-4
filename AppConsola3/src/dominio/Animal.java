package dominio;

public abstract class Animal {
	
	private String nombre;

	//constructores
	public Animal() {
		nombre = "Sin nombre";
	}
	
	public Animal(String nombre) {
		this.nombre = nombre;
	}
	
	//getters y setters
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	//metodo toString
	@Override
	public String toString() {
		return "ES UN ANIMAL, SU NOMBRE ES: " + nombre;
	}
	//metodo abstracto, me obliga a desarrollarlo en las clases hijas
	public abstract String habilidades();
}
