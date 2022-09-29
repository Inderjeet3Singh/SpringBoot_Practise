package account.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import account.dao.AccountJPA;
import account.model.Account;
import account.model.AccountStatus;


@Service
public class AccountService {
	
	
	@Autowired
	private AccountJPA accountJPA;

	public AccountStatus getAccountDetails(int accountNo) {
	
       AccountStatus accountStatus = new AccountStatus(1,"Abc", new Account(1,-1,-1,"",false));
		
       Optional<Account> x= accountJPA.findById(accountNo);
       if (x.isPresent())
		 {
    	   accountStatus.setAccountStatusCode(1);
    	   accountStatus.setMessage("found");
    	   accountStatus.setAccount(x.get());
		 }
		 else
			 System.out.println("customer id not present ");
       return accountStatus;
	}
	
	
		//return accountDao.getAccountDetailsFromDB(accountNo);
	

	public boolean updateAccount(Account updatedAccount) {
		
		boolean updated= false;
		if(accountJPA.existsById(updatedAccount.getAcno())) {
			accountJPA.save(updatedAccount);
			updated =true;
		}
	    return updated;
		//return accountDao.updateAccountInDb(updatedAccount);
	}

}
