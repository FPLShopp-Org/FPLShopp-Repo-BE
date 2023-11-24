package com.poly.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.poly.entity.Product;
import com.poly.service.CategoryService;
import com.poly.service.ProductService;
import com.poly.service.SessionService;

@Controller
public class ProductController {
	@Autowired
	CategoryService categoryService;

	@Autowired
	ProductService productService;
	@Autowired
	SessionService session;

	@RequestMapping("/product/detail/{id}")
	public String detail(Model model, @PathVariable("id") Integer id) {
		Product item = productService.findById(id);
		model.addAttribute("item", item);
		return "product/detail";
	}

//	@RequestMapping()
//	@GetMapping()
//	public String load(Model model, @RequestParam("p") Optional<Integer> p) {
//		Pageable pageable = PageRequest.of(p.orElse(0), 10);
//		Page<Product> page = productService.findAll(pageable);
//		System.out.println(page);
//		model.addAttribute("product", page);
//		model.addAttribute("category", categoryService.findAll());
//		return "index";
//
//	}

	/*
	 * @RequestMapping("product/search_and_page") public String searchAndPage(Model
	 * model, @RequestParam("p") Optional<Integer> p,
	 * 
	 * @RequestParam("keywords") Optional<String> kw) { String kwords =
	 * kw.orElse(session.get("keywords", "")); session.set("keywords", kwords);
	 * Pageable pageable = PageRequest.of(p.orElse(0), 6); Page<Product> page =
	 * productService.findAllByNameLike("%" + kwords + "%", pageable);
	 * model.addAttribute("page", page); return "listproduct/search_and_page"; }
	 */
}
