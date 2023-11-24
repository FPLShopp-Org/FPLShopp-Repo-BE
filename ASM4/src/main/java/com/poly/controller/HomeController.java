package com.poly.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.poly.dao.ProductDAO;
import com.poly.entity.Product;
import com.poly.service.ProductService;

@Controller
public class HomeController {

	@Autowired
	ProductDAO pdao;

	@Autowired
	ProductService productService;

	@RequestMapping({ "/", "index" })
	public String home(Model model, @RequestParam("cid") Optional<String> cid, @RequestParam("p") Optional<Integer> p) {
		Pageable pageable = PageRequest.of(p.orElse(0), 12);
		if (cid.isPresent()) {
			List<Product> list = productService.findByCategoryId(cid.get());
			model.addAttribute("items", list);
		} else {
			Page<Product> page = productService.findAll(pageable);
			System.out.println(page);
			model.addAttribute("items", page);
		}
		return "index";
	}

	@RequestMapping({ "/admin", "/admin/index" })
	public String admin(Model model) {
		return "redirect:/admin/index.html";
	}

	@RequestMapping("about")
	public String about() {
		return "about";
	}

	@RequestMapping("contact")
	public String contact() {
		return "contact";
	}
	@RequestMapping("FAQh")
	public String FAQh() {
		return "FAQh";
	}
	
	@RequestMapping("support")
	public String support() {
		return "support";
	}
	
	@RequestMapping("help")
	public String help() {
		return "help";
	}
}
