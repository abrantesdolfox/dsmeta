package com.devsuperioe.dsmeta.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devsuperioe.dsmeta.entities.Sale;
import com.devsuperioe.dsmeta.services.SaleService;

@RestController
@RequestMapping("/sales")
@CrossOrigin(origins = "*")
public class SaleController {
	
	final SaleService saleService;
	
	public SaleController(SaleService saleService) {
		this.saleService = saleService;
	}

	@GetMapping
	public List<Sale> findSales(){
		return saleService.findSales();
	}
}
