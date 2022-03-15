package ec.edu.uce.service;


import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ec.edu.uce.modelo.DetalleVenta;
import ec.edu.uce.repository.IDetalleVentaRepo;

@Service
public class DetalleVentaServiceImpl implements IDetalleVentaService{
	
	private static Logger LOG = Logger.getLogger(DetalleVentaServiceImpl.class);

	@Autowired
	private IDetalleVentaRepo detalleVentaRepo;
	
	@Override
	public void insertar(DetalleVenta detalleVenta) {
		// TODO Auto-generated method stub
		this.detalleVentaRepo.insertar(detalleVenta);
	}

	@Override
	public void actualizar(DetalleVenta detalleVenta) {
		// TODO Auto-generated method stub
		this.detalleVentaRepo.actualizar(detalleVenta);
	}

	@Override
	public DetalleVenta buscar(Integer id) {
		// TODO Auto-generated method stub
		return this.detalleVentaRepo.buscar(id);
	}

	@Override
	public void borrar(Integer id) {
		// TODO Auto-generated method stub
		this.detalleVentaRepo.borrar(id);
	}



}
