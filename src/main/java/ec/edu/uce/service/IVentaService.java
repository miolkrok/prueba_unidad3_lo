package ec.edu.uce.service;

import ec.edu.uce.modelo.Venta;

public interface IVentaService {
	
	void insertar(Venta venta);
	void actualizar(Venta venta);
	Venta buscar(Integer id);
	void borrar(Integer id);

}
