package dominio;

public class Perro extends Animal {

	private String raza;

	//constructor
	public Perro() {
		super();
		raza = "Sin raza";
	}
	
	public Perro(String nombre, String raza) {
		super(nombre);
		this.raza = raza;
	}
	
	//getters y setters
	public String getRaza() {
		return raza;
	}

	public void setRaza(String raza) {
		this.raza = raza;
	}

	//metodo toString
	@Override
	public String toString() {
		return "ES UN PERRO, SU NOMBRE ES: " + getNombre() + " Y SU RAZA ES: " + raza;
	}

	@Override
	public String habilidades() {
		
		return "Los perros pueden localizar y separar olores.";
	}
	
	
	
}
