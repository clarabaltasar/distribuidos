package service;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import informacionMonedas.Proveedor;

public interface ProveedorRepository extends JpaRepository<Proveedor,String> {
	Proveedor findByNombre(String nombre);
	Proveedor findByTelefono(String telefono);
	List<Proveedor> findByCodigoPostal(int cp);
}
