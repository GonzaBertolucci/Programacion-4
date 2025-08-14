package dominio;

public class Gato extends Animal {

	//constructores
	public Gato() {
		super();
	}
	
	public Gato(String nombre) {
		super(nombre);
	}
	
	//Metodo toString

	@Override
	public String toString() {
		return "ES UN GATO, SE LLAMA: " + getNombre();
	}

	@Override
	public String habilidades() {
	
		return "Los gatos tienen una gran flexibilidad y elasticidad";
	}
	
}
