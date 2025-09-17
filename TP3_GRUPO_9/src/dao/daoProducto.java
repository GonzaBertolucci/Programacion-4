package dao;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;


import entidad.Producto;

public class daoProducto {

	private String host = "jdbc:mysql://localhost:3306/";
	private String user = "root";
	private String pass = "root";
	private String dbName = "bdInventario";

	
	public daoProducto(){
		
	}
	
	
	//Alta
	public void AgregarProductoSP(Producto producto) {
		
		Connection cn;
		try {
			cn = DriverManager.getConnection(host + dbName, user, pass);
			CallableStatement cst = cn.prepareCall("CALL sp_AgregarProducto(?,?,?,?,?)");
			cst.setString(1, producto.getCodigo());
			cst.setString(2, producto.getNombre());
			cst.setDouble(3, producto.getPrecio());
			cst.setInt(4, producto.getStock());
			cst.setInt(5, producto.getIdCategoria());
			cst.execute();
		} catch (Exception e) {
			e.printStackTrace();
		}
	
	}

	
	//Baja
	public boolean eliminarProducto(String codigo) {
	    boolean eliminado = false;
	    Connection cn = null;
	    String query = "DELETE FROM productos WHERE codigo = ?";
	    try {
	        cn = DriverManager.getConnection(host + dbName, user, pass);
	        PreparedStatement ps = cn.prepareStatement(query);
	        ps.setString(1, codigo);
	        eliminado = ps.executeUpdate() > 0;
	    } catch (Exception e) {
	        e.printStackTrace();
	    }
	    return eliminado;
	}
	
	//Modificacion
	public int actualizarProducto(Producto producto) {
	    int filas = 0;
	    String query = "UPDATE Productos SET Nombre = ?, Precio = ?, Stock = ?, IdCategoria = ? WHERE Codigo = ?";

	    try {
	        Connection cn = DriverManager.getConnection(host + dbName, user, pass);
	        PreparedStatement ps = cn.prepareStatement(query);

	        ps.setString(1, producto.getNombre());
	        ps.setDouble(2, producto.getPrecio());
	        ps.setInt(3, producto.getStock());
	        ps.setInt(4, producto.getIdCategoria());
	        ps.setString(5, producto.getCodigo());
	  

	        filas = ps.executeUpdate();

	    } catch (Exception e) {
	        e.printStackTrace();
	    }

	    return filas; 
	}
	
	//Listado
	public ArrayList<Producto> listarProductos() {
	    ArrayList<Producto> lista = new ArrayList<>();
	    String query = "SELECT Codigo, Nombre FROM productos";

	    try {
	        Connection cn = DriverManager.getConnection(host + dbName, user, pass);
	        PreparedStatement ps = cn.prepareStatement(query);
	        ResultSet rs = ps.executeQuery();

	        while (rs.next()) {
	        	Producto c = new Producto();
	            c.setCodigo(rs.getString("Codigo"));
	            c.setNombre(rs.getString("Nombre"));
	            lista.add(c);
	        }

	    } catch (Exception e) {
	        e.printStackTrace();
	    }

	    return lista;
	}
	

}
