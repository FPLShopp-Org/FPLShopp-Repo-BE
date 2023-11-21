package shop.fplshop.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import shop.fplshop.entity.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{
    
}
