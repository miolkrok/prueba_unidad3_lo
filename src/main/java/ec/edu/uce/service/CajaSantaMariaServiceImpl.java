package ec.edu.uce.service;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import javax.transaction.Transactional;
import javax.transaction.Transactional.TxType;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ec.edu.uce.modelo.Producto;
import ec.edu.uce.modelo.Venta;

@Service
public class CajaSantaMariaServiceImpl implements ICajaSantaMariaService {
	
	private static Logger LOG = Logger.getLogger(CajaSantaMariaServiceImpl.class);
	
	@Autowired
	private IDetalleVentaService detServ;
	@Autowired
	private IProductoService prodServ;
	@Autowired
	private IVentaService ventServ;

	@Override
	@Transactional
	public void ingresarProductos(Producto producto, Integer stock) {
		// TODO Auto-generated method stub
		Producto prod = this.prodServ.buscarProductoCB(producto.getCodigoBarras());
		if(prod == null) {
			producto.setStock(stock);
			this.prodServ.insertar(producto);
		}else  {
			prod.setStock(prod.getStock()+1);
			this.prodServ.actualizar(producto);
		}
	}

	@Override
	@Transactional
	public void realizarVenta(String codigoBarras, Integer cantidad, String cedulaCliente, String numero) {
		// TODO Auto-generated method stub
		try {
			Producto rv = this.prodServ.buscarProductoCB(codigoBarras);
			if(rv == null || rv.getStock()==0) {
				throw new RuntimeException("stock superado");
			} else {
				Venta vent = new Venta();
				vent.setNumero(codigoBarras);
				vent.setFecha(LocalDateTime.now());
				vent.setCedulaCliente(cedulaCliente);
				vent.setTotalVenta(rv.getPrecio().multiply(new BigDecimal( (cantidad <= rv.getStock()) ? cantidad : rv.getStock())));
				
				this.ventServ.insertar(vent);
			}
			
		}catch (Exception e) {
			LOG.error("No se puede realizar la venta");
		}
	}

	@Override
	@Transactional(value = TxType.NOT_SUPPORTED)
	public Venta reporteVentas(LocalDateTime fecha, String categoria, Integer cantidad) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Producto consultarStock(String codigoBarras) {
		// TODO Auto-generated method stub
		return null;
	}

}
