package com.vical.domain;

import java.util.List;

public class Negro {
	private String nombre;
	private String tamanio;
	private String preferencia;
	private List<Embarazo> embarazos;
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getTamanio() {
		return tamanio;
	}
	public void setTamanio(String tamanio) {
		this.tamanio = tamanio;
	}
	public String getPreferencia() {
		return preferencia;
	}
	public void setPreferencia(String preferencia) {
		this.preferencia = preferencia;
	}
	public List<Embarazo> getEmbarazos() {
		return embarazos;
	}
	public void setEmbarazos(List<Embarazo> embarazos) {
		this.embarazos = embarazos;
	}
}