package dominio;

public class Principal {

	public static void main(String[] args) {
		
		Piloto p1 = new Piloto("Max Verstappen", new Redbull());
		p1.conducirCarrera();

	}

}
