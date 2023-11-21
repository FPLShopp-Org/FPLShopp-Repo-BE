package shop.fplshop.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import shop.fplshop.entity.Role;

public interface RoleRepository extends JpaRepository<Role, Long>{
    
}
