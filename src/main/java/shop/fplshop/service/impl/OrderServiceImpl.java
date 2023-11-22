package shop.fplshop.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import shop.fplshop.repository.OrderRepository;
import shop.fplshop.service.OrderService;

@Service
public class OrderServiceImpl implements OrderService{
    @Autowired
    OrderRepository orderRepository; 
}
