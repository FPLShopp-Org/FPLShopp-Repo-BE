package com.poly.repository;

import java.util.List;
import java.util.Set;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.poly.entity.Product;




@Repository
public interface ProductRepository extends JpaRepository<Product, Integer> {
	List<Product> findByNameContaining(String name);

	Page<Product> findByNameContaining(String name,Pageable pageable);
	
	@Query(value="SELECT *FROM products o WHERE o.name like ?%1", nativeQuery=true)
	List<Product> GetWomenProdByName(String womenprod);
	

	
	Page<Product> findAllByNameLike(String keywords, Pageable pageable);
	
	  //thongke
	 
		/*
		 * @Query("SELECT new Report(o.category, sum(o.unitPrice), count(o)) " +
		 * " FROM Product o " + " GROUP BY o.category" +
		 * " ORDER BY sum(o.unitPrice) DESC")
		 * 
		 * List<Report> getInventoryByCategory();
		 */

}
