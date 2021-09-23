package com.sagar.fcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.sagar.entity.Account;
import com.sagar.repo.AccountRepository;
@Controller
@RequestMapping("/api")
public class AccountController {

	@Autowired
	@Qualifier("accountRepository")
	private AccountRepository accountRepository;
	
	@RequestMapping(value="/accounts",method=RequestMethod.GET ,produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Account> accountDetails(){
		return accountRepository.findAll();
	}
	
}
