package ec.edu.uce.repository;

import ec.edu.uce.modelo.Venta;

public interface IVentaRepo {
	
	void insertar(Venta venta);
	void actualizar(Venta venta);
	Venta buscar(Integer id);
	void borrar(Integer id);

}
