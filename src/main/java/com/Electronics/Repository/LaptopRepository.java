package com.Electronics.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.Electronics.Entity.Laptop;

public interface LaptopRepository extends JpaRepository<Laptop,Integer>{
	@Query(value="select c from Laptop c where c.brand=:s")
	public List<Laptop>GetBrand(@Param("s")String s);
	@Query(value="select c from Laptop c where c.brand=:s") 
	public List<Laptop>GetByBrand(@Param("s")String s);
	@Query(value="select c from Laptop c where c.price=:v") 
	public List<Laptop>GetByPrice(@Param("v")int v);
	@Query(value="select c from Laptop c where c.model=:v") 
	public List<Laptop>GetByModel(@Param("v")String v);
	

	
	
	
	
	


	

}
