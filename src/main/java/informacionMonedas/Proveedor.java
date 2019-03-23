package informacionMonedas;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;
import org.springframework.data.annotation.Id;

@Entity
@Table(name = "PROVEEDOR")
public class Proveedor {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name = "CODIGO_FISCAL")
	private String codigoIDFiscal;
	
	@Column(name ="NOMBRE")
	private String nombre;
	
	@Column(name ="CODIGO_POSTAL")
	private int cp;
	
	@Column(name ="EMAIL")
	private String email;
	
	@Column(name ="TELEFONO")
	private String telefono;
	
	
	
	
	public Proveedor(String codigoIDFiscal, String nombre, int cp, String email, String telefono) {
		this.codigoIDFiscal = codigoIDFiscal;
		this.nombre = nombre;
		this.cp = cp;
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
		return this.cp;
	}
	public void setCP(int cp) {
		this.cp = cp;
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
