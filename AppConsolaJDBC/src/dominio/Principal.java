package dominio;

import java.util.ArrayList;

public class Principal {

	public static void main(String[] args) {
		
		Usuario usuario1 = new Usuario();
		UsuarioDao usuarioDao = new UsuarioDao();
		
		usuario1.setNombre("Homero");
		usuario1.setApellido("Simpson");
		usuarioDao.ejecutarSPCrearUsuario(usuario1);
		
		/*	
		int filas = usuarioDao.agregarUsuario(usuario1);
		
		if (filas == 1) {
			System.out.println("Usuario agregado");
		}
		else {
			System.out.println("Error al agregar usuario");
		}
	
		UsuarioDao usuarioDao = new UsuarioDao();
		Usuario usuario2 = usuarioDao.obtenerUsuario2(2);
		System.out.println(usuario2.toString());
		*/
		
		/*ArrayList<Usuario> lUsuario = usuarioDao.obtenerTodosLosUsuarios();
		for(Usuario user : lUsuario) {
			System.out.println(user.toString());
		}
		*/
		
	}

		

}
