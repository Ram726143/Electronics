package com.Electronics.Controller;

import java.util.List;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.Electronics.Entity.Laptop;
import com.Electronics.Exception.BrandNotFound;
import com.Electronics.Exception.BrandNotFounds;
import com.Electronics.Exception.ModelNotFoundException;
import com.Electronics.Exception.PriceNotFoundException;
import com.Electronics.Service.LaptopService;

import org.springframework.web.bind.annotation.RequestParam;


@RestController
public class LaptopController {
	@Autowired
	LaptopService la;
	@PostMapping(value="/Postlap")
	public String postlap(@RequestBody Laptop l) {
		return la.postlap(l);
	}
	
	@PostMapping(value="/PostlapsDel")
	public String postlapval(@RequestBody List<Laptop> l) {
		return la.postlapval(l);
	}
	
	@GetMapping(value="/GetBrand/{s}")
	public List<Laptop> GetBrand(@PathVariable String s) {
		return la.GetBrand(s);
		
	}
	@GetMapping(value="/GetByBrand/{s}")
	public List<Laptop> GetByBrand(@PathVariable String s) throws BrandNotFound {
		return la.GetByBrand(s);
	}
	
	@GetMapping(value="/GetByBrand1/{l}")
	public List<Laptop> GetByBrand1(@PathVariable String l)throws BrandNotFounds {
		return la.GetByBrand1(l); 
	}
	
	
	@GetMapping(value="/GetByPrice/{v}")
	public List<Laptop> GetByPrice(@PathVariable int v) throws PriceNotFoundException {
		return la.GetByPrice(v);
		
	}
	@GetMapping(value="/GetByModel/{v}")
	public List<Laptop> GetByModel(@PathVariable String v) throws ModelNotFoundException {
		return la.GetByModel(v);
		
	}
	
	
	}
	
	
	

	
	
	

}
