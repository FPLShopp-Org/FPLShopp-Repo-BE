package shop.fplshop.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import shop.fplshop.repository.VoucherRepository;
import shop.fplshop.service.VoucherService;

@Service
public class VoucherServiceImpl implements VoucherService{
    @Autowired
    VoucherRepository voucherRepository;
}
