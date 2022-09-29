package account.service;

import org.springframework.stereotype.Service;

import account.model.Account;
import account.model.AccountStatus;


@Service
public class AccountService {

	public AccountStatus getAccountDetails(int accountNo) {
		// TODO Auto-generated method stub
		
		System.out.println("input is "+ accountNo);
		AccountStatus accountStatus = new AccountStatus(1, "abc", new Account(1,-1,1,"",false));
		return accountStatus;
	}

	public boolean updateAccount(Account updatedAccount) {
		System.out.println("input is "+ updatedAccount);
		return false;
	}

}
