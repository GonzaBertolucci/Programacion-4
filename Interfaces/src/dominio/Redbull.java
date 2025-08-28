package dominio;

public class Redbull implements IMonoplazaF1 {
	
	

	@Override
	public void arrancarMotor() {
		System.out.println("Enciende el motor..");
		
	}

	@Override
	public void acelerar() {
		System.out.println("El Redbull acelera a toda velocidad...");
		
	}

	@Override
	public void frenar() {
		System.out.println("El Redbull frena sin complicaciones en curva...");
		
	}

	@Override
	public void entrarBoxes() {
		System.out.println("El Redbull hace una parada rapida en los pits...");
		
	}
	
}
