package main;

import java.util.ArrayList;

import dao.daoCategoria;
import dao.daoProducto;
import entidad.Categoria;
import entidad.Producto;

public class Principal {

	public static void main(String[] args) {
		
		daoCategoria daoCategoria = new daoCategoria();
		Categoria categoria = new Categoria();
		
		daoProducto daoProducto = new daoProducto();
		Producto producto = new Producto();
		
		//ALTA
	
		Categoria cat1 = new Categoria();
		cat1.setNombreCategoria("Lácteos");
		daoCategoria.agregarCategoria(cat1);

		Categoria cat2 = new Categoria();
		cat2.setNombreCategoria("Bebidas");
		daoCategoria.agregarCategoria(cat2);

		Categoria cat3 = new Categoria();
		cat3.setNombreCategoria("Snacks");
		daoCategoria.agregarCategoria(cat3);

		Categoria cat4 = new Categoria();
		cat4.setNombreCategoria("Limpieza");
		daoCategoria.agregarCategoria(cat4);

		Categoria cat5 = new Categoria();
		cat5.setNombreCategoria("Higiene Personal");
		daoCategoria.agregarCategoria(cat5);
		
		Producto p1 = new Producto();
		p1.setCodigo("P001");
		p1.setNombre("Leche");
		p1.setPrecio(120);
		p1.setStock(50);
		p1.setIdCategoria(1); 
		daoProducto.AgregarProductoSP(p1);

		Producto p2 = new Producto();
		p2.setCodigo("P002");
		p2.setNombre("Queso");
		p2.setPrecio(800);
		p2.setStock(20);
		p2.setIdCategoria(1); 
		daoProducto.AgregarProductoSP(p2);

		Producto p3 = new Producto();
		p3.setCodigo("P003");
		p3.setNombre("Coca Cola");
		p3.setPrecio(600);
		p3.setStock(40);
		p3.setIdCategoria(2); 
		daoProducto.AgregarProductoSP(p3);

		Producto p4 = new Producto();
		p4.setCodigo("P004");
		p4.setNombre("Agua Mineral");
		p4.setPrecio(200);
		p4.setStock(100);
		p4.setIdCategoria(2); 
		daoProducto.AgregarProductoSP(p4);

		Producto p5 = new Producto();
		p5.setCodigo("P005");
		p5.setNombre("Papas Fritas");
		p5.setPrecio(450);
		p5.setStock(30);
		p5.setIdCategoria(3); 
		daoProducto.AgregarProductoSP(p5);

		Producto p6 = new Producto();
		p6.setCodigo("P006");
		p6.setNombre("Galletitas Oreo");
		p6.setPrecio(350);
		p6.setStock(25);
		p6.setIdCategoria(3); 
		daoProducto.AgregarProductoSP(p6);

		Producto p7 = new Producto();
		p7.setCodigo("P007");
		p7.setNombre("Detergente");
		p7.setPrecio(700);
		p7.setStock(15);
		p7.setIdCategoria(4); 
		daoProducto.AgregarProductoSP(p7);

		Producto p8 = new Producto();
		p8.setCodigo("P008");
		p8.setNombre("Lavandina");
		p8.setPrecio(400);
		p8.setStock(18);
		p8.setIdCategoria(4); 
		daoProducto.AgregarProductoSP(p8);

		Producto p9 = new Producto();
		p9.setCodigo("P009");
		p9.setNombre("Shampoo");
		p9.setPrecio(900);
		p9.setStock(12);
		p9.setIdCategoria(5); 
		daoProducto.AgregarProductoSP(p9);

		Producto p10 = new Producto();
		p10.setCodigo("P010");
		p10.setNombre("Jabón");
		p10.setPrecio(250);
		p10.setStock(40);
		p10.setIdCategoria(5); 
		daoProducto.AgregarProductoSP(p10);
		
		
		
		//BAJA
		daoCategoria.eliminarCategoria(1);	
		daoProducto.eliminarProducto("1");
			
		
		
		//Modificacion
		categoria.setIdCategoria(2);
		categoria.setNombreCategoria("Bebidas");
		daoCategoria.actualizarCategoria(categoria);

		producto.setCodigo("1");
		producto.setNombre("Fanta");
		producto.setPrecio(2500);
		producto.setStock(10);
		producto.setIdCategoria(2);
		daoProducto.actualizarProducto(producto);
		
		//Listado
		ArrayList<Categoria> categorias = daoCategoria.listarCategorias();
		for(Categoria cate : categorias) {
			System.out.println(cate.toString());
		}
		
		
		ArrayList<Producto> productos = daoProducto.listarProductos();
		for(Producto cate : productos) {
			System.out.println(cate.toString());
		}
	}
}
