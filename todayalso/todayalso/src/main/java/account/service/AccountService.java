package account.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import account.dao.AccountDAO;
import account.model.Account;
import account.model.AccountStatus;


@Service
public class AccountService {
	
	@Autowired
	private AccountDAO accountDao;

	public AccountStatus getAccountDetails(int accountNo) {
		// TODO Auto-generated method stub
		
		return accountDao.getAccountDetailsFromDB(accountNo);
	}

	public boolean updateAccount(Account updatedAccount) {
	
		return accountDao.updateAccountInDb(updatedAccount);
	}

}
