package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import javax.annotation.PostConstruct;
import javax.management.InstanceNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.entity.ModeloMonedas;
import com.example.demo.entity.Proveedor;
import com.example.demo.entity.StockMuseo;
import com.example.demo.service.MonedasRepository;
import com.example.demo.service.ProveedorRepository;
import com.example.demo.service.StockRepository;


@Controller
public class ProveedorController {
	

	@Autowired
	private ProveedorRepository repProveedor;
	
	@Autowired
	private MonedasRepository repMonedas;
	
	@Autowired
	private StockRepository repStock;
	
	@RequestMapping("/proveedor")
	public String goProveedor(Model model) {
		List<Proveedor> proveedores = repProveedor.findAll();
		model.addAttribute("listaProveedores", proveedores);
		return  "ConsultarProveedores";
	}
	
    @RequestMapping("/paniadir")
    public String aniadirProveedorFormulario() {
        return "gestionarProveedores";
    }

    @RequestMapping(value = "/paniadir/submit", method = RequestMethod.POST)
    public String submitProveedorFormulario(Proveedor proveedor) {
        repProveedor.save(proveedor);
        return "redirect:/proveedor";
    }
	
    @RequestMapping("/pmodificar/{tlf}")
    public String modificarProveedorFormulario(Model model, @PathVariable String tlf) {
        model.addAttribute("p", repProveedor.findByTelefono(tlf));
        return "modificarProveedor";
    }

    @RequestMapping(value = "/pmodificar/submit", method = RequestMethod.POST)
    public String submitProveedorFormularioModificar(
            @RequestParam Optional<String> nombre,
            @RequestParam Optional<Integer> codigo,
            @RequestParam Optional<String> email,
            @RequestParam Optional<String> telefono,
            @RequestParam String tlf) {
        Proveedor p = repProveedor.findByTelefono(tlf);
        if (p == null)
            throw new ItemNotFoundException("No existe ningun proveedor con teléfono " + tlf);
        if (nombre.isPresent())
            if (!nombre.get().isEmpty())
                p.setNombre(nombre.get());
        if (codigo.isPresent())
            if (codigo.get() == null)
                p.setCP(codigo.get());
        if (email.isPresent())
            if (!email.get().isEmpty())
                p.setEmail(email.get());
        if (telefono.isPresent())
            if (!telefono.get().isEmpty())
                p.setTelefono(telefono.get());
        repProveedor.save(p);
        return "redirect:/proveedor";
    }
    
    @RequestMapping(value = "/pborrar/{tlf}")
    public String borrarPropietario(@PathVariable String tlf){
        Proveedor p = repProveedor.findByTelefono(tlf);
        if (p == null)
            throw new ItemNotFoundException("No existe ningun proveedor con teléfono " + tlf);
        //repStock.delete(repStock.findByProveedor(p));
        repProveedor.delete(p);
        return "redirect:/proveedor";
    }
    
	/*@RequestMapping(value = "/proveedor/añadir/submit", method = RequestMethod.POST)
    public String añadirProveedor(Proveedor proveedor,
    						@RequestParam Optional<String> codigo_fiscalProveedor,
				            @RequestParam Optional<String> nombreProveedor,
				            @RequestParam Optional<Integer> codigoProveedor,
				            @RequestParam Optional<String> emailProveedor,
				            @RequestParam Optional<String> telefonoProveedor){
				            
                        
        //proveedor.setDuenoPropiedad(propietarioRepository.getOne(idPropietario));
        
        repProveedor.save(proveedor);
        return "ConsultarProveedores";
    }*/
	
	

}
