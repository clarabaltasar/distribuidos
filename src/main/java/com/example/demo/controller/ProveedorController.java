package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
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
	
	@RequestMapping(value = "/proveedor/añadir/submit", method = RequestMethod.POST)
    public String añadirProveedor(Proveedor proveedor,
				            @RequestParam Optional<String> nombreProveedor,
				            @RequestParam Optional<Integer> codigoProveedor,
				            @RequestParam Optional<String> emailProveedor,
				            @RequestParam Optional<String> telefonoProveedor){
				            
                        
        //proveedor.setDuenoPropiedad(propietarioRepository.getOne(idPropietario));
        
        repProveedor.save(proveedor);
        return "ConsultarProveedores";
    }
	
	

}
