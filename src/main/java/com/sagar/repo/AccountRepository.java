package com.sagar.repo;

import java.math.BigInteger;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sagar.entity.Account;

public interface AccountRepository extends JpaRepository<Account, BigInteger> {

	List<Account> findAll();

}
