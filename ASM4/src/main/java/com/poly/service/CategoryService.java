package com.poly.service;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.poly.entity.Category;

public interface CategoryService {

	List<Category> findAll();

	Category findById(String id);

	Category create(Category category);

	Category update(Category category);

	void delete(String id);
	
	Page<Category> findAll(Pageable pageable);
 
	Page<Category> findByNameContaining(String name, Pageable pageable);


}
