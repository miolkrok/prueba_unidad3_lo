package ec.edu.uce.repository;

import ec.edu.uce.modelo.Producto;

public interface IProductoRepo {
	
	void insertar(Producto producto);
	void actualizar(Producto producto);
	Producto buscar(Integer id);
	void borrar(Integer id);
	Producto buscarProductoCB(String codigoBarras);


}
