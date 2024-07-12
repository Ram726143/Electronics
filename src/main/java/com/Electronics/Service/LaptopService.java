package com.Electronics.Service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Electronics.Dao.LaptopDao;
import com.Electronics.Entity.Laptop;
import com.Electronics.Exception.BrandNotFound;
import com.Electronics.Exception.BrandNotFounds;
import com.Electronics.Exception.ModelNotFoundException;
import com.Electronics.Exception.PriceNotFoundException;

@Service
public class LaptopService {
	@Autowired
	LaptopDao da;

	public String postlap(Laptop l) {
		return da.postlap(l);
	}
	
	public String postlapval(List<Laptop> l) {
		return da.postlapval(l);
	}

	public List<Laptop> GetBrand(String s) {
		return da.GetBrand(s);
	}
	

	public List<Laptop> GetByBrand(String s) throws BrandNotFound {
		if (da.GetByBrand(s).isEmpty()) {
			throw new BrandNotFound("This brand is not found in db");
		} else {
			return da.GetByBrand(s);
		}
	}
	
	public List<Laptop> GetByBrand1(String l)throws BrandNotFounds{
		List<Laptop> x=da.GetByBrand1(l);
		List<Laptop> pro=x.stream().filter(y->y.getBrand().equals(l)).collect(Collectors.toList());
		
		if(pro.isEmpty()) {
			throw new BrandNotFounds("Exception throw in error");		
			}
		else {
			return da.GetByBrand1(l);
		}
	}

	public List<Laptop> GetByPrice(int v) throws PriceNotFoundException {
		if (da.GetByPrice(v).isEmpty()) {
			throw new PriceNotFoundException("This price is not found in db");

		} else {
			return da.GetByPrice(v);
		}
	}

	public List<Laptop> GetByModel(String v) throws ModelNotFoundException {
		if (da.GetByModel(v).isEmpty()) {
			throw new ModelNotFoundException("This model is not found in db");

		} else {
			return da.GetByModel(v);

		}
	}
	


	
}


