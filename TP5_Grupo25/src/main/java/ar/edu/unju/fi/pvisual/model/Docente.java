package ar.edu.unju.fi.pvisual.model;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;

import org.springframework.stereotype.Component;

@Component
public class Docente {
	@Min(value=1, message="El valor minimo es 1") @Max(value=999, message="El valor maximo es 999")
	private int legajo;
	@NotEmpty(message="Debe ingresar un nombre")
	private String nombre;
	@NotEmpty(message="Debe ingresar el apellido")
	private String apellido;
	@NotEmpty(message="Debe ingresar el Email")
	private String email;
    @Max(value=1111111111, message="El numero debe ser de 10 dijitos")
	private int telefono;
	
	public Docente() {
		super();
	}

	public Docente(int legajo, String nombre, String apellido, String email, int telefono) {
		super();
		this.legajo = legajo;
		this.nombre = nombre;
		this.apellido = apellido;
		this.email = email;
		this.telefono = telefono;
	}

	public int getLegajo() {
		return legajo;
	}

	public void setLegajo(int legajo) {
		this.legajo = legajo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getTelefono() {
		return telefono;
	}

	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}
}
