package Ejercicio1;

public class ExVerificarDNI extends RuntimeException{
	
	public ExVerificarDNI() {
		
	}

	@Override
	public String getMessage() {
		
		return "El Dni no tiene Exactamente 8 caracteres númericos";
	}
	
}
