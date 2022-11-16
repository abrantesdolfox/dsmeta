package com.devsuperioe.dsmeta.controllers;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
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
	public Page<Sale> findSales(
			@RequestParam(value = "minDate", defaultValue = "") String minDate, 
			@RequestParam(value = "maxDate", defaultValue = "") String maxDate, 
			Pageable pageable){
		return saleService.findSales(minDate, maxDate, pageable);
	}
}
