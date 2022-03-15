package ec.edu.uce.modelo;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name= "detalle_venta")
public class DetalleVenta {
	
	
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_detalle_venta")
	@SequenceGenerator(name = "seq_detalle_venta", sequenceName = "seq_detalle_venta", allocationSize = 1)
	@Id
	@Column(name = "deve_id")
	private Integer id;
	@Column(name = "deve_cantidad")
	private Integer Cantidad;
	@Column(name = "deve_precio_unitario")
	private BigDecimal precioUnitario;
	@Column(name = "deve_subtotal")
	private BigDecimal subatotal;
	@ManyToOne
	@JoinColumn(name="vent_id")
	private Venta venta;
	@ManyToOne
	@JoinColumn(name="prod_id")
	private Producto producto;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getCantidad() {
		return Cantidad;
	}
	public void setCantidad(Integer cantidad) {
		Cantidad = cantidad;
	}
	public BigDecimal getPrecioUnitario() {
		return precioUnitario;
	}
	public void setPrecioUnitario(BigDecimal precioUnitario) {
		this.precioUnitario = precioUnitario;
	}
	public BigDecimal getSubatotal() {
		return subatotal;
	}
	public void setSubatotal(BigDecimal subatotal) {
		this.subatotal = subatotal;
	}
	public Venta getVenta() {
		return venta;
	}
	public void setVenta(Venta venta) {
		this.venta = venta;
	}
	public Producto getProducto() {
		return producto;
	}
	public void setProducto(Producto producto) {
		this.producto = producto;
	}
	@Override
	public String toString() {
		return "DetalleVenta [id=" + id + ", Cantidad=" + Cantidad + ", precioUnitario=" + precioUnitario
				+ ", subatotal=" + subatotal + ", venta=" + venta + ", producto=" + producto + "]";
	}
	



}
