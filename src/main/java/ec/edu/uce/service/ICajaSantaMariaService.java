package ec.edu.uce.service;

import java.time.LocalDateTime;

import ec.edu.uce.modelo.Producto;
import ec.edu.uce.modelo.Venta;

public interface ICajaSantaMariaService {
	
	void ingresarProductos(Producto producto, Integer stock);
	void realizarVenta(String codigoBarras, Integer cantidad, String cedulaCliente, String numero);
	Venta reporteVentas(LocalDateTime fecha, String categoria, Integer cantidad);
	Producto consultarStock(String codigoBarras);
	

}
