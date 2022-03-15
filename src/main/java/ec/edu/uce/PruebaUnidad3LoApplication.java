package ec.edu.uce;


import java.math.BigDecimal;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import ec.edu.uce.modelo.Producto;
import ec.edu.uce.service.ICajaSantaMariaService;
import ec.edu.uce.service.IProductoService;


@SpringBootApplication
public class PruebaUnidad3LoApplication implements CommandLineRunner{
	private static Logger LOG = Logger.getLogger(PruebaUnidad3LoApplication.class);
	
	@Autowired
	private IProductoService productoServ;
	@Autowired
	private ICajaSantaMariaService santaMariaServ;

	public static void main(String[] args) {
		SpringApplication.run(PruebaUnidad3LoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		

//		Producto p1 = new Producto();
//		p1.setCodigoBarras("251-254");
//		p1.setNombre("manzana");
//		p1.setCategoria("frutas");
//		p1.setStock(2);
//		p1.setPrecio(new BigDecimal(0.25));
//
//		this.santaMariaServ.ingresarProductos(p1, 3);
//		
//		Producto p3 = new Producto();
//		p3.setCodigoBarras("252-254");
//		p3.setNombre("queso");
//		p3.setCategoria("lacteos");
//		p3.setStock(20);
//		p3.setPrecio(new BigDecimal(3.25));
//		
//		this.santaMariaServ.ingresarProductos(p3, 20);
		
//		this.santaMariaServ.realizarVenta("252-254", 1, "1718496944", "24");
//		this.santaMariaServ.realizarVenta("251-254", 1, "1718496944", "23");
		
		
		

	}


}
