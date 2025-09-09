package Ejercicio2;

import java.util.ArrayList;
import java.util.Iterator;

public class mainEjercio2 {

	public static void main(String[] args) {
			
		ArrayList<Edificio> lista = new ArrayList<>();

        
        lista.add(new Polideportivo("Poli A", 1200.5, 1));
        lista.add(new Polideportivo("Poli B", 900.0, 2));
        lista.add(new Polideportivo("Poli C", 1500.75, 1));

       
        lista.add(new EdificioDeOficinas(25, 3000.0));
        lista.add(new EdificioDeOficinas(40, 5000.5));

        Iterator<Edificio> it = lista.iterator();
        while (it.hasNext()) {
        	Edificio e = it.next();
        	it.remove();
            System.out.println(e.toString());
	
        
        }

	}
}
