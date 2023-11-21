package shop.fplshop.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import shop.fplshop.entity.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{
    
}
