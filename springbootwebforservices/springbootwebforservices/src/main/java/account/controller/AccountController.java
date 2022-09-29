package account.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import account.model.Account;
import account.model.AccountStatus;


@RestController
public class AccountController {
	
	
	@GetMapping("/gad")
	public AccountStatus getAccountDetails(@RequestParam int accountNo) {
		
		System.out.println("input is "+ accountNo);
		
		AccountStatus accountStatus = new AccountStatus(1, "abc", new Account(1,-1,1,"",false));
		return accountStatus;
		
		
	}
	
	@PutMapping("/updateAccount")
	public boolean updateAccount( @RequestBody Account updatedAccount) {
		
		System.out.println("input is "+ updatedAccount);
		return false;
	}

}
