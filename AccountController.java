package com.example.demo;
import java.util.ArrayList;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;;

@RestController
@RequestMapping("/account")
public class AccountController {
	ArrayList<Account> accounts = new ArrayList<>();
	@GetMapping("/")
	ArrayList<Account> getAccounts() {
		return accounts;
	}
	
	@GetMapping("/{id}")
	Account getAccount(@PathVariable("id") int id){
		if(id < accounts.size()) {
			System.out.println("id "+id);
			return accounts.get(id);
		}
		return null;
	}
	
	@PostMapping
	void addAccount(@RequestBody Account account) {
		System.out.println(account);
		accounts.add(account);
	}
	
	@PutMapping
	void updateAccount() {
		System.out.println("Accound Updated");
	}
	
}