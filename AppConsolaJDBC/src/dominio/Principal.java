package dominio;

import java.util.ArrayList;

public class Principal {

	public static void main(String[] args) {
		/*
		UsuarioDao usuarioDao = new UsuarioDao();
		
		Usuario usuario1 = new Usuario();
		
		usuario1.setNombre("Maria");
		usuario1.setApellido("Fernandez");
		
		int filas = usuarioDao.agregarUsuario(usuario1);
		
		if (filas == 1) {
			System.out.println("Usuario agregado");
		}
		else {
			System.out.println("Error al agregar usuario");
		}
	*/
		//Usuario usuario2 = new UsuarioDao().obtenerUsuario(1);
		//System.out.println(usuario2.toString());
		
		UsuarioDao usuarioDao = new UsuarioDao();
		
		ArrayList<Usuario> lUsuario = usuarioDao.obtenerTodosLosUsuarios();
		for(Usuario user : lUsuario) {
			System.out.println(user.toString());
		}
		
	}

		

}
