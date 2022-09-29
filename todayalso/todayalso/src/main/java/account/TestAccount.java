package account;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import account.model.Account;
import account.model.AccountStatus;
import account.service.AccountService;

@SpringBootApplication
public class TestAccount implements CommandLineRunner {
    
	@Autowired
	private AccountService accountService;

	public static void main(String[] args) {

		SpringApplication.run(TestAccount.class, args);

	}

	@Override
	public void run(String... args) throws Exception {

//		Account updatedAccount= new Account(2,224022,45000,"w@gamil.com",false);
//		boolean updatedStatus = accountService.updateAccount(updatedAccount);
//		if(updatedStatus)
//			System.out.println("account updated");
//		else
//			System.out.println("account not updated");
		
		int accountNo = 23;

		AccountStatus accountStatus = accountService.getAccountDetails(accountNo);

		if (accountStatus.getAccountStatusCode() == 0)

			System.out.println("account details not found");
		else
			System.out.println("account details found " + accountStatus.getAccount());
     
	}
     
}
