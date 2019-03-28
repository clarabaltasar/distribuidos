package com.example.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "PROVEEDOR")
public class Proveedor {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long codigo_fiscal;
	private String nombre;
	private int codigo;
	private String email;
	private String telefono;
	
	
	public Proveedor() {
		
	}
	
	public Proveedor(String nombre, int cp, String email, String telefono) {
		this.nombre = nombre;
		this.codigo = cp;
		this.email = email;
		this.telefono = telefono;
	}
	public long getcodigo_fiscal() {
		return codigo_fiscal;
	}
	public void setcodigo_fiscal(long codigo_fiscal) {
		this.codigo_fiscal = codigo_fiscal;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getCP() {
		return this.codigo;
	}
	public void setCP(int cp) {
		this.codigo = cp;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	
	

}
