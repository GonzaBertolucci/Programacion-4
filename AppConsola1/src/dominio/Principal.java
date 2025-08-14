package dominio;

public class Principal {

	public static void main(String[] args) {
	/*
		Articulo art = new Articulo();
		Articulo art2 = new Articulo();
		Articulo art3 = new Articulo();
	
		art.setNombre("Articulo 1");
		System.out.println(art.toString());
		art2.setNombre("Articulo 2");
		System.out.println(art2.toString());
		art3.setNombre("Articulo 3");
		System.out.println(art3.toString());
	*/

		Articulo[] vArt = new Articulo[3];
		vArt[0] = new Articulo("Articulo 1");
		vArt[1] = new Articulo("Articulo 2");
		vArt[2] = new Articulo("Articulo 3");
		
		for (Articulo articulo : vArt) {
			System.out.println(articulo.toString());
		}
		
		//Imprimo metodo
		System.out.println(Articulo.devuelveProximoID());
	}
	

	

}
