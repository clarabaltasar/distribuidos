package informacionMonedas;

import javax.persistence.Entity;

@Entity
public class proveedor {
	
	private String codigoIDFiscal;
	private String nombre;
	private int CP;
	private String email;
	private String telefono;
	public proveedor(String codigoIDFiscal, String nombre, int cP, String email, String telefono) {
		super();
		this.codigoIDFiscal = codigoIDFiscal;
		this.nombre = nombre;
		CP = cP;
		this.email = email;
		this.telefono = telefono;
	}
	public String getCodigoIDFiscal() {
		return codigoIDFiscal;
	}
	public void setCodigoIDFiscal(String codigoIDFiscal) {
		this.codigoIDFiscal = codigoIDFiscal;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getCP() {
		return CP;
	}
	public void setCP(int cP) {
		CP = cP;
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
