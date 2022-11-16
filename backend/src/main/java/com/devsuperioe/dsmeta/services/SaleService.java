package com.devsuperioe.dsmeta.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.devsuperioe.dsmeta.entities.Sale;
import com.devsuperioe.dsmeta.repositories.SaleRepository;

@Service
public class SaleService {

	final SaleRepository saleRepository;
	
	public SaleService(SaleRepository saleRepository) {
		this.saleRepository = saleRepository;
	}
	
	public List<Sale> findSales() {
		return saleRepository.findAll();
	}
}
