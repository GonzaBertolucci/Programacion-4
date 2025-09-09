package Ejercicio1;
import java.time.LocalDate;
import java.util.HashSet;
import java.util.Iterator;

public class MainEjercicio1_d {
	
	public static void main(String [] args) {
		HashSet<Persona> ListaPersona = new HashSet<Persona>();
        
		Persona persona1 = new Persona("43652329", "Uriel", "Vargas",LocalDate.of(1990, 6, 14),"Masculino", "Campeones 3", "1198765432", "Urix@gmail.com");
		Persona persona2 = new Persona("31500496", "María", "Flores", LocalDate.of(1979, 5, 7),"Femenino", "Pilar 300", "1185624498", "María.44@gmail.com");
		Persona persona3 = new Persona("39649731", "Florencia", "Perez", LocalDate.of(1994, 1, 20), "Femenino", "Paraguay 1984", "1147298042" , "Flor@gmail.com");
		Persona persona4 = new Persona("48674228", "Gabriel", "Castillo", LocalDate.of(1999, 9, 4), "Masculino", "Dr.Penna 456", "1183649264" , "Gabriell.78@gmail.com");
		Persona persona5 = new Persona("43652329", "Uriel", "Vargas",LocalDate.of(1990, 6, 14),"Masculino", "Campeones 3", "1198765432", "Urix@gmail.com");
		
        ListaPersona.add(persona1);
        ListaPersona.add(persona1);

        ListaPersona.add(persona2);
        ListaPersona.add(persona3);
        ListaPersona.add(persona4);
        ListaPersona.add(persona5);//NO LO AGREGA YA QUE ESEL MÍSMO QUE LA PERSONA 1.
        
        Iterator<Persona> iterador = ListaPersona.iterator();
        while(iterador.hasNext()) {
        	Persona persona = (Persona) iterador.next();
        	System.out.println(persona.toString());
        }
	}
}
