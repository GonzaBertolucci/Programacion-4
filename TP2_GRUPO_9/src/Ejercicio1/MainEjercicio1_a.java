package Ejercicio1;

import javax.swing.JOptionPane;

public class MainEjercicio1_a {

    public static void main(String[] args) {
        
        try {
            Persona p1 = new Persona("AA202020");
            System.out.println("Persona agregada correctamente");
        } catch (ExVerificarDNI e) {
            System.out.println("Persona no agregada por no verificar el DNI");
            e.printStackTrace();
        }

        try {
            Persona p2 = new Persona("20202020");
            System.out.println("Persona agregada correctamente");
        } catch (ExVerificarDNI e) {
            System.out.println("Persona no agregada por no verificar el DNI");
            e.printStackTrace();
        }
       
    }
}
