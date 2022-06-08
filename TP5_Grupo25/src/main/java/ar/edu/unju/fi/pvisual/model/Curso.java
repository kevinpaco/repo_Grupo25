package ar.edu.unju.fi.pvisual.model;

import org.springframework.stereotype.Component;

@Component
public class Curso {
	private int codigo;
	private String titulo;
	private String categoria;
	private String fecha_inicio;
	private String fecha_fin;
	private int horas;
	private String modalidad;
	private String docente;

	public Curso() {
		super();
	}

	public Curso(int codigo, String titulo, String categoria, String fecha_inicio, String fecha_fin, int horas,
			String modalidad, String docente) {
		super();
		this.codigo = codigo;
		this.titulo = titulo;
		this.categoria = categoria;
		this.fecha_inicio = fecha_inicio;
		this.fecha_fin = fecha_fin;
		this.horas = horas;
		this.modalidad = modalidad;
		this.docente = docente;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
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

	public int getHoras() {
		return horas;
	}

	public void setHoras(int horas) {
		this.horas = horas;
	}

	public String getModalidad() {
		return modalidad;
	}

	public void setModalidad(String modalidad) {
		this.modalidad = modalidad;
	}

	public String getDocente() {
		return docente;
	}

	public void setDocente(String docente) {
		this.docente = docente;
	}
}
