package com.example.demo.controller;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.entity.ModeloMonedas;
import com.example.demo.entity.Proveedor;
import com.example.demo.entity.StockMuseo;
import com.example.demo.service.MonedasRepository;
import com.example.demo.service.ProveedorRepository;
import com.example.demo.service.StockRepository;

@Controller
public class ProveedorController {
//	@Autowired
//	private ProveedorRepository repProveedor;
//	@Autowired
//	private MonedasRepository repMonedas;
//	@Autowired
//	private StockRepository repStock;
//	@PostConstruct
//	public void init() {
//		Proveedor p1 = new Proveedor("Proveedor 1", 28965,"proveedor1@gmail.com","666554433");
//		ModeloMonedas m1 = new ModeloMonedas("cara","Euros",20.5,20,"Acero","MONEDA MUY BONITA");
//		repProveedor.save(p1);
//		repProveedor.save(new Proveedor("Proveedor 2", 28950,"proveedor2@gmail.com","666554499"));
//		repProveedor.save(new Proveedor("Proveedor 3", 28950,"proveedor3@gmail.com","666557788"));
//		repMonedas.save(m1);
//		repStock.save(new StockMuseo(1997,"Madrid","17/02/2008","BUENO", p1,m1));
//	}
//	@RequestMapping("/")
//	public String goHome(Model model) {
//		return  "index";
//	}
	
	

}
