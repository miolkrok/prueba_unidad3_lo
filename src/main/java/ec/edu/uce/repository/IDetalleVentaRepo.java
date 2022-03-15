package ec.edu.uce.repository;

import ec.edu.uce.modelo.DetalleVenta;

public interface IDetalleVentaRepo {
	
	void insertar(DetalleVenta detalleVenta);
	void actualizar(DetalleVenta detalleVenta);
	DetalleVenta buscar(Integer id);
	void borrar(Integer id);
	
}
