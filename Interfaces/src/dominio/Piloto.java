package dominio;

public class Piloto {
	
	private String nombre;
	private IMonoplazaF1 monoplaza;
	
	public Piloto(String nombre, IMonoplazaF1 monoplaza) {
		this.nombre = nombre;
		this.monoplaza = monoplaza;
	}
	
	public void conducirCarrera() {
		System.out.println("El piloto: "+ nombre + " comienza la carrera");
		monoplaza.arrancarMotor();
		monoplaza.acelerar();
		monoplaza.frenar();
		monoplaza.entrarBoxes();
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre, IMonoplazaF1 monoplaza) {
		this.nombre = nombre;
		this.monoplaza = monoplaza;
	}

	@Override
	public String toString() {
		return "Piloto [nombre=" + nombre + "]";
	}

}
