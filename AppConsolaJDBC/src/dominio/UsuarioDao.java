package dominio;

import java.sql.Statement;
import java.util.ArrayList;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;


public class UsuarioDao {
	private String host = "jdbc:mysql://localhost:3306/";
	private String user = "root";
	private String pass = "root";
	private String dbName = "bdregistro";
	
	public UsuarioDao() {
		
	}
	
	public int agregarUsuario(Usuario usuario) {
		String query = "Insert into usuario(nombre, apellido) values ('"+usuario.getNombre()+"','"+usuario.getApellido()+"')";
		
		Connection cn = null;
		int filas = 0;
		try {
			cn = DriverManager.getConnection(host+dbName, user, pass);
			Statement st = cn.createStatement();
			filas = st.executeUpdate(query);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return filas;
	}
	
	public Usuario obtenerUsuario(int id) {
		Usuario x = new Usuario();
		
		Connection cn = null;
		try {
			cn = DriverManager.getConnection(host + dbName, user, pass);
			Statement st = cn.createStatement();
			String query = "SELECT * FROM USUARIO WHERE ID= "+id;
			ResultSet rs = st.executeQuery(query);
			rs.next(); //Trae la fila
			x.setNombre(rs.getString("nombre"));
			x.setApellido(rs.getNString("apellido"));
			x.setId(rs.getInt("id"));
		}
		catch(Exception e){
			e.printStackTrace();
		}
		return x;
	}
	
	public Usuario obtenerUsuario2(int id) {
		Usuario x = new Usuario();
		
		Connection cn = null;
		try {
			cn = DriverManager.getConnection(host + dbName, user, pass);
			String query = "SELECT * FROM USUARIO WHERE ID= ?";
			PreparedStatement pst = cn.prepareStatement(query);
			pst.setInt(1, id);
			ResultSet rs = pst.executeQuery();
			rs.next();
			
			x.setId(rs.getInt(1));
			x.setNombre(rs.getString("nombre"));
			x.setApellido(rs.getString("Apellido"));
		}
		catch(Exception e){
			e.printStackTrace();
		}
		return x;
	}
	
	public ArrayList<Usuario> obtenerTodosLosUsuarios(){
		
		ArrayList<Usuario> lUsuarios = new ArrayList<Usuario>();
		Connection cn = null;
		try {
			cn = DriverManager.getConnection(host + dbName, user, pass);
			String query = "SELECT * FROM USUARIO";
			Statement st = cn.createStatement();
			ResultSet rs = st.executeQuery(query);
			while(rs.next()) {
				Usuario x = new Usuario();
				x.setId(rs.getInt("id"));
				x.setNombre(rs.getString("nombre"));
				x.setApellido(rs.getString("apellido"));
				lUsuarios.add(x);
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return lUsuarios;
	}
	
	public void ejecutarSPCrearUsuario(Usuario usuario) {
		Connection cn = null;
		try {
			cn = DriverManager.getConnection(host + dbName, user, pass);
			CallableStatement cst= cn.prepareCall("CALL crearUsuario(?,?)");
			cst.setString(1, usuario.getNombre());
			cst.setString(2, usuario.getApellido());
			cst.execute();

		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
}
