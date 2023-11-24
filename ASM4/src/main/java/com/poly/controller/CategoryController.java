package com.poly.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import com.poly.entity.Product;
import com.poly.service.ProductService;

@Controller
public class CategoryController {
	@Autowired
	private ProductService productService;
	
	@GetMapping("/category")
	public String viewCategory(Model model) {
		Pageable pageable = PageRequest.of(0, 12);
		
		Page<Product> page = productService.findAll(pageable);
		
		model.addAttribute("items", page);
			
		return "category/category.html";	
	}
	
}
