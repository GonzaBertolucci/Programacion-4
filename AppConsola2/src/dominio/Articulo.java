package dominio;

public class Articulo {
	
	//atributos
	
	private int id;
	private String nombre;
	//La variable static se crea con la clas. Si no tuviera static al principio se crearia una por clase por lo que el contador siempre seria 1
	//En este caso tiene un "nivel superior" y se crea junto a la clase en global por asi decirlo.
	//Variable estática: variable que pertenece a la clase en lugar de a sus objetos, compartiendo el mismo valor entre todas las instancias.
	static int cont = 0;
	
	//Metodo estatico
	//método que pertenece a la clase y no a sus instancias, por lo que se puede invocar sin crear un objeto y solo puede acceder directamente a miembros estáticos de la clase.
	public static int devuelveProximoID() {
		return cont+1;
	}
	
	//constructores
	public Articulo(){
		cont++;
		this.id = cont;
		nombre = "Sin nombre";
	}
	
	public Articulo(String nombre) {
		cont++;
		this.id = cont;
		this.nombre = nombre;
	}
	
	//getters y setters
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	//Metodo toString
	@Override
	public String toString() {
		return "ARTICULO ID=" + id + ", NOMBRE=" + nombre;
	}
	
	
	
}
