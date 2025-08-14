package dominio;

public class Principal {
	
	public static void main(String[] args) {
		
		//Animal animal = new Animal("Animal");
		Animal gato = new Gato("Michi");
		Animal perro = new Perro("Huesos", "Galgo");
		
		//System.out.println(animal.toString());
		System.out.println(gato.toString() + "\n" + gato.habilidades());
		System.out.println(perro.toString() + "\n" + perro.habilidades());
		
		/*
		Animal[] animales = new Animal[3];
		animales[0] = animal;
		animales[1] = gato;
		animales[2] = perro;
		
		for (Animal a : animales) {
			System.out.println(a.toString());
		}
		*/
	}
}
