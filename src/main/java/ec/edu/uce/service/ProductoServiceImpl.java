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
	private IProductoRepo modeloDosRepo;
	
	@Override
	public void insertar(Producto producto) {
		// TODO Auto-generated method stub
		this.modeloDosRepo.insertar(producto);
	}

	@Override
	public void actualizar(Producto producto) {
		// TODO Auto-generated method stub
		this.modeloDosRepo.actualizar(producto);
	}

	@Override
	public Producto buscar(Integer id) {
		// TODO Auto-generated method stub
		return this.modeloDosRepo.buscar(id);
	}

	@Override
	public void borrar(Integer id) {
		// TODO Auto-generated method stub
		this.modeloDosRepo.borrar(id);
	}

}
