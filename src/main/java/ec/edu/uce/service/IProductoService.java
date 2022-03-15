package ec.edu.uce.service;

import ec.edu.uce.modelo.Producto;

public interface IProductoService {
	
	void insertar(Producto producto);
	void actualizar(Producto producto);
	Producto buscar(Integer id);
	void borrar(Integer id);

}
