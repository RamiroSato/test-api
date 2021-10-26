package ar.com.integral.domain;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "t_sgp_mensajes_cab")
public class MensajeCabecera {
	@Id
	private Integer cod;
	private String cod_afiliado;
	private Integer cod_estado;
	private Integer cod_tipo;
	private Date fecha_cierre;
	private Integer cod_usuario_actual;
	private String chat_id;
	private String cod_alternativo;
	private char origen;
	
	public Integer getCodigo() {
		return cod;
	}
	public void setCodigo(Integer codigo) {
		this.cod = codigo;
	}
	public String getCod_afiliado() {
		return cod_afiliado;
	}
	public void setCod_afiliado(String cod_afiliado) {
		this.cod_afiliado = cod_afiliado;
	}
	public Integer getCod_estado() {
		return cod_estado;
	}
	public void setCod_estado(Integer cod_estado) {
		this.cod_estado = cod_estado;
	}
	public Integer getCod_tipo() {
		return cod_tipo;
	}
	public void setCod_tipo(Integer cod_tipo) {
		this.cod_tipo = cod_tipo;
	}
	public Date getFecha_cierre() {
		return fecha_cierre;
	}
	public void setFecha_cierre(Date fecha_cierre) {
		this.fecha_cierre = fecha_cierre;
	}
	public Integer getCod_usuario_actual() {
		return cod_usuario_actual;
	}
	public void setCod_usuario_actual(Integer cod_usuario_actual) {
		this.cod_usuario_actual = cod_usuario_actual;
	}
	public String getChat_id() {
		return chat_id;
	}
	public void setChat_id(String chat_id) {
		this.chat_id = chat_id;
	}
	public String getCod_alternativo() {
		return cod_alternativo;
	}
	public void setCod_alternativo(String cod_alternativo) {
		this.cod_alternativo = cod_alternativo;
	}
	public char getOrigen() {
		return origen;
	}
	public void setOrigen(char origen) {
		this.origen = origen;
	}
	
	@Override
	public String toString() {
		return "MensajeCabecera [codigo=" + cod + ", cod_afiliado=" + cod_afiliado + ", cod_estado=" + cod_estado
				+ ", cod_tipo=" + cod_tipo + ", fecha_cierre=" + fecha_cierre + ", cod_usuario_actual="
				+ cod_usuario_actual + ", chat_id=" + chat_id + ", cod_alternativo=" + cod_alternativo + ", origen="
				+ origen + "]";
	}
	
}
