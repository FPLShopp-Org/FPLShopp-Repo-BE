package com.poly.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.poly.dao.CategoryDAO;
import com.poly.entity.Category;
import com.poly.repository.CategoryRepository;
import com.poly.service.CategoryService;

@Service
public class CategoryServiceImpl implements CategoryService {
   
	@Autowired(required = true)
	CategoryDAO cdao;
	
	@Autowired
	CategoryRepository categoryRepository;

//	public CategoryServiceImpl(CategoryRepository categoryRepository) {
//		this.categoryRepository = categoryRepository;
//	} 
	
	@Override
	public Page<Category> findByNameContaining(String name, Pageable pageable) {
		return categoryRepository.findByNameContaining(name, pageable);
	}
	@Override
	public Page<Category> findAll(Pageable pageable) {
		return categoryRepository.findAll(pageable);
	}
	
	

	@Override
	public List<Category> findAll() {
		return cdao.findAll();
	}

	@Override
	public Category findById(String id) {
		return cdao.findById(id).get();
	}

	public Category create(Category category) {
		return cdao.save(category);
	}

	@Override
	public Category update(Category category) {
		return cdao.save(category);
	}

	@Override
	public void delete(String id) {
		cdao.deleteById(id);
	}

}
