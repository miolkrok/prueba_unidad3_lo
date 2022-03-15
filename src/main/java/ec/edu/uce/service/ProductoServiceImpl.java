package ec.edu.uce.service;


import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ec.edu.uce.modelo.Producto;
import ec.edu.uce.repository.IProductoRepo;

@Service
public class ProductoServiceImpl implements IProductoService{
	
	private static Logger LOG = Logger.getLogger(ProductoServiceImpl.class);

	@Autowired
	private IProductoRepo productoRepo;
	
	@Override
	public void insertar(Producto producto) {
		// TODO Auto-generated method stub
		this.productoRepo.insertar(producto);
	}

	@Override
	public void actualizar(Producto producto) {
		// TODO Auto-generated method stub
		this.productoRepo.actualizar(producto);
	}

	@Override
	public Producto buscar(Integer id) {
		// TODO Auto-generated method stub
		return this.productoRepo.buscar(id);
	}

	@Override
	public void borrar(Integer id) {
		// TODO Auto-generated method stub
		this.productoRepo.borrar(id);
	}

	@Override
	public Producto buscarProductoCB(String codigoBarras) {
		// TODO Auto-generated method stub
		return this.productoRepo.buscarProductoCB(codigoBarras);
	}

}
