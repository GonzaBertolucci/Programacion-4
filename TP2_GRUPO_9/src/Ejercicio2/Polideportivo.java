package Ejercicio2;

public class Polideportivo implements InstalacionDeportiva, Edificio {
	
	
	// Atributos 
	private String nombre;
	private double superficie; 
	private int tipoDeInstalacion;
	
	
	// Constructores
	public Polideportivo(String nombre, double superficie, int tipoDeInstalacion) {
		
		this.nombre = nombre;
		this.superficie = superficie;
		this.tipoDeInstalacion = tipoDeInstalacion;
	}
	
	@Override
    public int getTipoDeInstalacion() {
        return tipoDeInstalacion;
    }

    @Override
    public double getSuperficieEdificio() {
        return superficie;
    }

	public String getNombre() {
		return nombre;
	}
	
	public void setTipoDeInstalacion(int tipoDeInstalacion) {
		this.tipoDeInstalacion = tipoDeInstalacion;
	}
	
	public void setSuperficieEdificio(Double superficie) {
		this.superficie = superficie;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	
	 @Override
	    public String toString() {
	        return "Polideportivo [nombre=" + nombre + 
	               ", superficie=" + superficie + " m²" + 
	               ", tipoDeInstalacion=" + tipoDeInstalacion + "]";
	    }
	
	
    
    
}
