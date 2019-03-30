package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.demo.entity.Proveedor;
import com.example.demo.entity.StockMuseo;
import com.example.demo.service.MonedasRepository;
import com.example.demo.service.ProveedorRepository;
import com.example.demo.service.StockRepository;

@Controller
public class StockController {
	
	@Autowired
	private ProveedorRepository repProveedor;
	
	@Autowired
	private MonedasRepository repMonedas;
	
	@Autowired
	private StockRepository repStock;
	
	
	@RequestMapping("/stock-museo")
	public String goStock(Model model) {
		List<StockMuseo> stock = repStock.findAll();
		model.addAttribute("stock", stock);
		return  "ConsultarStock";
	}
	
    @RequestMapping("/saniadir")
    public String aniadirMonedaFormulario() {
        return "gestionarStock";
    }

    @RequestMapping(value = "/saniadir/submit", method = RequestMethod.POST)
    public String submitStockFormulario(StockMuseo stock) {
        repStock.save(stock);
        return "redirect:/stock-museo";
    }

}
