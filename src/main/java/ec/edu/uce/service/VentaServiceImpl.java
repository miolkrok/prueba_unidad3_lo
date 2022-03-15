package ec.edu.uce.service;


import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ec.edu.uce.modelo.Venta;
import ec.edu.uce.repository.IVentaRepo;

@Service
public class VentaServiceImpl  implements IVentaService{
	
	private static Logger LOG = Logger.getLogger(VentaServiceImpl.class);
	
	@Autowired
	private IVentaRepo modeloUnoRepo;

	@Override
	public void insertar(Venta venta) {
		// TODO Auto-generated method stub
		this.modeloUnoRepo.insertar(venta);
	}

	@Override
	public void actualizar(Venta venta) {
		// TODO Auto-generated method stub
		this.modeloUnoRepo.actualizar(venta);
	}

	@Override
	public Venta buscar(Integer id) {
		// TODO Auto-generated method stub
		return this.modeloUnoRepo.buscar(id);
	}

	@Override
	public void borrar(Integer id) {
		// TODO Auto-generated method stub
		this.modeloUnoRepo.borrar(id);
	}

}
