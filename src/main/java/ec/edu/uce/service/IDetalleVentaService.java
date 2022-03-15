package ec.edu.uce.service;

import ec.edu.uce.modelo.DetalleVenta;

public interface IDetalleVentaService {
	
	void insertar(DetalleVenta detalleVenta);
	void actualizar(DetalleVenta detalleVenta);
	DetalleVenta buscar(Integer id);
	void borrar(Integer id);

}
