package shop.fplshop.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import shop.fplshop.entity.Account;

public interface AccountRepository extends JpaRepository<Account, Long>{
    
}
