package shop.fplshop.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import shop.fplshop.entity.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{
    
}
