package Ejercicio2;

public class EdificioDeOficinas implements Edificio {
	
	//ATRIBUTOS
    private int numeroDeOficinas;
    private double superficie;

    
    //CONSTUCTOR
    public EdificioDeOficinas(int numeroDeOficinas, double superficie) {
        this.numeroDeOficinas = numeroDeOficinas;
        this.superficie = superficie;
    }

    //METODOS GET Y SET
    @Override
    public double getSuperficieEdificio() {
        return superficie;
    }

    public int getNumeroDeOficinas() {
        return numeroDeOficinas;
    }

    public void setNumeroDeOficinas(int numeroDeOficinas) {
        this.numeroDeOficinas = numeroDeOficinas;
    }
    
    //ToString
    @Override
    public String toString() {
        return "Edificio de oficinas [número de oficinas =" + numeroDeOficinas +
               ", superficie =" + superficie + " m²]"; 
    }
}
