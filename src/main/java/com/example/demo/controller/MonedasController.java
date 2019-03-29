package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.entity.ModeloMonedas;
import com.example.demo.service.MonedasRepository;
import com.example.demo.service.ProveedorRepository;
import com.example.demo.service.StockRepository;

@Controller
public class MonedasController {
	
	@Autowired
	private ProveedorRepository repProveedor;
	
	@Autowired
	private MonedasRepository repMonedas;
	
	@Autowired
	private StockRepository repStock;
	
	
	
	@RequestMapping("/modelo-monedas")
	public String goModeloMonedas(Model model) {
		List<ModeloMonedas> modelos = repMonedas.findAll();
		model.addAttribute("listaMonedas", modelos);
		return  "ConsultarModelosMonedas";
	}

}

