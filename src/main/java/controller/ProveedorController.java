package controller;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import informacionMonedas.Proveedor;
import service.ProveedorRepository;

@Controller
public class ProveedorController {
	@Autowired
	private ProveedorRepository repProveedor;
	@PostConstruct
	public void init() {
	repProveedor.save(new Proveedor("48578465L", "Proveedor 1", 28965,"proveedor1@gmail.com","666554433"));
	repProveedor.save(new Proveedor("48578789L", "Proveedor 2", 28950,"proveedor2@gmail.com","666554499"));
	repProveedor.save(new Proveedor("48578123L", "Proveedor 3", 28950,"proveedor3@gmail.com","666557788"));
	}

}
