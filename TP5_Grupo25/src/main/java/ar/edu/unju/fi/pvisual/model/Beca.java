package ar.edu.unju.fi.pvisual.model;

import org.springframework.stereotype.Component;

@Component
public class Beca {
	private int codigo;
	private String curso;
	private String fecha_inicio;
	private String fecha_fin;
	private String estado;
	
	public Beca() {
		super();
	}

	public Beca(int codigo, String curso, String fecha_inicio, String fecha_fin, String estado) {
		super();
		this.codigo = codigo;
		this.curso = curso;
		this.fecha_inicio = fecha_inicio;
		this.fecha_fin = fecha_fin;
		this.estado = estado;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}

	public String getFecha_inicio() {
		return fecha_inicio;
	}

	public void setFecha_inicio(String fecha_inicio) {
		this.fecha_inicio = fecha_inicio;
	}

	public String getFecha_fin() {
		return fecha_fin;
	}

	public void setFecha_fin(String fecha_fin) {
		this.fecha_fin = fecha_fin;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	
}
