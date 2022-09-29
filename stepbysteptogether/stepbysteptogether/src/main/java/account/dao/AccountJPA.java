package account.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import account.model.Account;


@Repository
public interface AccountJPA extends JpaRepository<Account, Integer> {

}
