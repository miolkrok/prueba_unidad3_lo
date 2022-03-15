package ec.edu.uce.modelo;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name= "venta")
public class Venta {
	
	
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_venta")
	@SequenceGenerator(name = "seq_venta", sequenceName = "seq_venta", allocationSize = 1)
	@Id
	@Column(name = "vent_id")
	private Integer id;
	@Column(name = "vent_numero")
	private String numero;
	@Column(name = "vent_fecha", columnDefinition = "TIMESTAMP")
	private LocalDateTime fecha;
	@Column(name = "vent_cedula_cliente")
	private String cedulaCliente;
	@Column(name = "vent_total_venta")
	private BigDecimal totalVenta;
	@OneToMany(mappedBy = "venta",cascade=CascadeType.ALL)
	private List<DetalleVenta> detallesVentV;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public LocalDateTime getFecha() {
		return fecha;
	}
	public void setFecha(LocalDateTime fecha) {
		this.fecha = fecha;
	}
	public String getCedulaCliente() {
		return cedulaCliente;
	}
	public void setCedulaCliente(String cedulaCliente) {
		this.cedulaCliente = cedulaCliente;
	}
	public BigDecimal getTotalVenta() {
		return totalVenta;
	}
	public void setTotalVenta(BigDecimal totalVenta) {
		this.totalVenta = totalVenta;
	}
	public List<DetalleVenta> getDetallesVentV() {
		return detallesVentV;
	}
	public void setDetallesVentV(List<DetalleVenta> detallesVentV) {
		this.detallesVentV = detallesVentV;
	}
	@Override
	public String toString() {
		return "Venta [id=" + id + ", numero=" + numero + ", fecha=" + fecha + ", cedulaCliente=" + cedulaCliente
				+ ", totalVenta=" + totalVenta + ", detallesVentV=" + detallesVentV + "]";
	}
	

}
