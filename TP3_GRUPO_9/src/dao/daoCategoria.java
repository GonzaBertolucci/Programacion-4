package dao;

import java.util.ArrayList;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import entidad.Categoria;

public class daoCategoria {
	private String host = "jdbc:mysql://localhost:3306/";
	private String user = "root";
	private String pass = "root";
	private String dbName = "bdInventario";
	
	
	public daoCategoria(){
		
	}
	
	
	//Alta
	public int agregarCategoria(Categoria categoria) {
		String query = "INSERT INTO categorias (Nombre) VALUES (?)";
		Connection cn = null;
		int filas = 0;
		try {
			cn = DriverManager.getConnection(host+dbName, user, pass);
			PreparedStatement ps = cn.prepareStatement(query);
			ps.setString(1, categoria.getNombreCategoria());
			filas = ps.executeUpdate();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		return filas;
	}
	
	//Baja
	public boolean eliminarCategoria(int idCategoria) {
	    boolean eliminado = false;
	    Connection cn = null;
	    String query = "DELETE FROM categorias WHERE IdCategoria = ?";
	    try {
	        cn = DriverManager.getConnection(host + dbName, user, pass);
	        PreparedStatement ps = cn.prepareStatement(query);
	        ps.setInt(1, idCategoria);
	        eliminado = ps.executeUpdate() > 0;
	    } catch (Exception e) {
	        e.printStackTrace();
	    }
	    return eliminado;
	}
	
	//Modificacion
	public int actualizarCategoria(Categoria categoria) {
	    int filas = 0;
	    String query = "UPDATE categorias SET Nombre = ? WHERE IdCategoria = ?";

	    try {
	        Connection cn = DriverManager.getConnection(host + dbName, user, pass);
	        PreparedStatement ps = cn.prepareStatement(query);

	        ps.setString(1, categoria.getNombreCategoria());
	        ps.setInt(2, categoria.getIdCategoria());

	        filas = ps.executeUpdate();

	    } catch (Exception e) {
	        e.printStackTrace();
	    }

	    return filas; 
	}
	
	//Listado
	public ArrayList<Categoria> listarCategorias() {
	    ArrayList<Categoria> lista = new ArrayList<>();
	    String query = "SELECT IdCategoria, Nombre FROM categorias";

	    try {
	        Connection cn = DriverManager.getConnection(host + dbName, user, pass);
	        PreparedStatement ps = cn.prepareStatement(query);
	        ResultSet rs = ps.executeQuery();

	        while (rs.next()) {
	            Categoria c = new Categoria();
	            c.setIdCategoria(rs.getInt("IdCategoria"));
	            c.setNombreCategoria(rs.getString("Nombre"));
	            lista.add(c);
	        }

	    } catch (Exception e) {
	        e.printStackTrace();
	    }

	    return lista;
	}
	
	
}
