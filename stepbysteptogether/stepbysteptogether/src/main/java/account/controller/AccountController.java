package account.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import account.model.Account;
import account.model.AccountStatus;
import account.service.AccountService;


@RestController
public class AccountController {
	
	@Autowired
	private AccountService accountService;
	
	@GetMapping("/gad")
	public AccountStatus getAccountDetails(@RequestParam int accountNo) {
		
		System.out.println("input is "+ accountNo);
		
		return accountService.getAccountDetails(accountNo);
		
		
	}
	
	@PutMapping("/updateAccount")
	public boolean updateAccount( @RequestBody Account updatedAccount) {
		
		System.out.println("input is "+ updatedAccount);
		return accountService.updateAccount(updatedAccount);
	}

}
 