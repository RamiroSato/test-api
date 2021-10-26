package ar.com.integral.domain;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "t_sgp_mensajes_det")
public class MensajeDetalle{
	@Id
	private Integer cod;
	private String mensaje;
	private Date fechaEmision;
	private String codEmisor;
	private String codSala;
	private Long cod_cab;
	private Date fec_apertura;
	private Date fec_cierre;
	private Date fecha_carga;
	private String id_mensaje_chatapi;
	private String quoted_msg_body;
	private String quoted_msg_id;
	
	
	
	public Integer getCodigo() {
		return cod;
	}



	public void setCodigo(Integer codigo) {
		this.cod = codigo;
	}



	public String getMensaje() {
		return mensaje;
	}



	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}



	public Date getFechaEmision() {
		return fechaEmision;
	}



	public void setFechaEmision(Date fechaEmision) {
		this.fechaEmision = fechaEmision;
	}



	public String getCodEmisor() {
		return codEmisor;
	}



	public void setCodEmisor(String codEmisor) {
		this.codEmisor = codEmisor;
	}



	public String getCodSala() {
		return codSala;
	}



	public void setCodSala(String codSala) {
		this.codSala = codSala;
	}



	public Long getCod_cab() {
		return cod_cab;
	}



	public void setCod_cab(Long cod_cab) {
		this.cod_cab = cod_cab;
	}



	public Date getFec_apertura() {
		return fec_apertura;
	}



	public void setFec_apertura(Date fec_apertura) {
		this.fec_apertura = fec_apertura;
	}



	public Date getFec_cierre() {
		return fec_cierre;
	}



	public void setFec_cierre(Date fec_cierre) {
		this.fec_cierre = fec_cierre;
	}



	public Date getFecha_carga() {
		return fecha_carga;
	}



	public void setFecha_carga(Date fecha_carga) {
		this.fecha_carga = fecha_carga;
	}



	public String getId_mensaje_chatapi() {
		return id_mensaje_chatapi;
	}



	public void setId_mensaje_chatapi(String id_mensaje_chatapi) {
		this.id_mensaje_chatapi = id_mensaje_chatapi;
	}



	public String getQuoted_msg_body() {
		return quoted_msg_body;
	}



	public void setQuoted_msg_body(String quoted_msg_body) {
		this.quoted_msg_body = quoted_msg_body;
	}



	public String getQuoted_msg_id() {
		return quoted_msg_id;
	}



	public void setQuoted_msg_id(String quoted_msg_id) {
		this.quoted_msg_id = quoted_msg_id;
	}



	@Override
	public String toString() {
		return "t_sgp_mensajes_det [codigo=" + cod + ", mensaje=" + mensaje + ", fechaEmision=" + fechaEmision
				+ ", codEmisor=" + codEmisor + ", codSala=" + codSala + ", cod_cab=" + cod_cab + ", fec_apertura="
				+ fec_apertura + ", fec_cierre=" + fec_cierre + ", fecha_carga=" + fecha_carga + ", id_mensaje_chatapi="
				+ id_mensaje_chatapi + ", quoted_msg_body=" + quoted_msg_body + ", quoted_msg_id=" + quoted_msg_id
				+ "]";
	}
	
}
