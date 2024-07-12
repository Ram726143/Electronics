package com.Electronics.Dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.Electronics.Entity.Laptop;
import com.Electronics.Repository.LaptopRepository;

@Repository
public class LaptopDao {
	@Autowired
	LaptopRepository re;

	public String postlap(Laptop l) {
		re.save(l);
		return "Posted SuccessFully";
	}
	
	public String postlapval(List<Laptop> l) {
		re.saveAll(l);
		return "Posted in Successfully";
	}

	public List<Laptop> GetBrand(String s) {

		return re.GetBrand(s);
	}

	public List<Laptop> GetByBrand(String s) {
		return re.GetByBrand(s);

	}
	
	public List<Laptop> GetByBrand1(String l) {
		return re.findAll();
	}

	public List<Laptop> GetByPrice(int v) {
		return re.GetByPrice(v);
	}

	public List<Laptop> GetByModel(String v) {
		return re.GetByModel(v);

	}

	

}
