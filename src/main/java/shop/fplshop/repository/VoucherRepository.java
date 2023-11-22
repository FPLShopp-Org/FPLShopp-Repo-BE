package shop.fplshop.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import shop.fplshop.entity.Voucher;

public interface VoucherRepository extends JpaRepository<Voucher, Long>{
    
}
