package com.poly.controller;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.poly.service.SessionService;
import com.poly.entity.*;
import com.poly.service.OrderService;

@Controller
public class OrderController {

	@Autowired
	OrderService orderService;

	@Autowired
	HttpServletRequest request;
	@Autowired
	SessionService session;

	@RequestMapping("/cart/view")
	public String cart() {
		return "cart/view";
	}

	@RequestMapping("/cart/checkout")
	public String checkout() {
		if (!(request.isUserInRole("MNG") || request.isUserInRole("STA") || request.isUserInRole("CTM"))) {
			return "redirect:/auth/login/form";
		}
		return "cart/checkout";
	}

	@RequestMapping("/order/list")
	public String list(Model model, HttpServletRequest request) {
		String username = request.getRemoteUser();
		model.addAttribute("orders", orderService.findByUsername(username));
		return "order/list";
	}

	@RequestMapping("/order/detail/{id}")
	public String detail(@PathVariable("id") Long id, Model model) {
		model.addAttribute("order", orderService.findById(id));
		return "order/detail";
	}
	
}
