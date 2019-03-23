package informacionMonedas;

import javax.persistence.*;

import org.springframework.data.annotation.Id;

@Entity
@Table(name = "MODELO_MONEDAS")
public class ModeloMonedas {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name = "MONEDA_ID")
	private int id;
	
	@Column(name = "VALOR_FACIAL")
	private String valorFacial;
	
	@Column(name = "UNIDAD_MONETARIA")
	private String unidadMonetaria;
	
	@Column(name = "DIAMETRO")
	private double diametro;
	
	@Column(name = "PESO")
	private double peso;
	
	@Column(name = "METAL")
	private String metal;
	
	@Column(name = "DESCRIPCION")
	private String descripcion;
	
	
	public ModeloMonedas(String valorFacial, String unidadMonetaria, double diametro, double peso, String metal,
			String descripcion, int id) {
		this.valorFacial = valorFacial;
		this.unidadMonetaria = unidadMonetaria;
		this.diametro = diametro;
		this.peso = peso;
		this.metal = metal;
		this.descripcion = descripcion;
		this.id = id;
	}

	public String getValorFacial() {
		return valorFacial;
	}

	public void setValorFacial(String valorFacial) {
		this.valorFacial = valorFacial;
	}

	public String getUnidadMonetaria() {
		return unidadMonetaria;
	}

	public void setUnidadMonetaria(String unidadMonetaria) {
		this.unidadMonetaria = unidadMonetaria;
	}

	public double getDiametro() {
		return diametro;
	}

	public void setDiametro(double diametro) {
		this.diametro = diametro;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public String getMetal() {
		return metal;
	}

	public void setMetal(String metal) {
		this.metal = metal;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	
	
	

}
