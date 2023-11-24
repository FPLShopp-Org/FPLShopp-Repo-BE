package com.poly.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.poly.entity.Account;



@Repository
public interface AccountRepository extends JpaRepository<Account, String> {
	// for login
	Account findByUsernameAndPassword(String username, String password);

    //forget pass
	public Account findByEmail(String email);

	public Account findByUsername(String username);

	<S extends Account> S save(String entity);
    
	//sign-up
	public boolean existsByEmail(String email);

}
