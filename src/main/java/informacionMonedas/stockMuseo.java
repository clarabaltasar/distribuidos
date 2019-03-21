package informacionMonedas;

import javax.persistence.Entity;

@Entity
public class stockMuseo {
	
	private int id;
	private int anioAcuniacion;
	private String ciudadAcuniacion;
	private String fechaAdquisicion;
	private String estadoConservacion;
	private int proveedor;
	public stockMuseo(int id, int anioAcuniacion, String ciudadAcuniacion, String fechaAdquisicion,
			String estadoConservacion, int proveedor) {
		super();
		this.id = id;
		this.anioAcuniacion = anioAcuniacion;
		this.ciudadAcuniacion = ciudadAcuniacion;
		this.fechaAdquisicion = fechaAdquisicion;
		this.estadoConservacion = estadoConservacion;
		this.proveedor = proveedor;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getAnioAcuniacion() {
		return anioAcuniacion;
	}
	public void setAnioAcuniacion(int anioAcuniacion) {
		this.anioAcuniacion = anioAcuniacion;
	}
	public String getCiudadAcuniacion() {
		return ciudadAcuniacion;
	}
	public void setCiudadAcuniacion(String ciudadAcuniacion) {
		this.ciudadAcuniacion = ciudadAcuniacion;
	}
	public String getFechaAdquisicion() {
		return fechaAdquisicion;
	}
	public void setFechaAdquisicion(String fechaAdquisicion) {
		this.fechaAdquisicion = fechaAdquisicion;
	}
	public String getEstadoConservacion() {
		return estadoConservacion;
	}
	public void setEstadoConservacion(String estadoConservacion) {
		this.estadoConservacion = estadoConservacion;
	}
	public int getProveedor() {
		return proveedor;
	}
	public void setProveedor(int proveedor) {
		this.proveedor = proveedor;
	}

}
