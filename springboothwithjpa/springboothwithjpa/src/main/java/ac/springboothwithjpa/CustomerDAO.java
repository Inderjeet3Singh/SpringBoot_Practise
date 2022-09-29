package ac.springboothwithjpa;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
//dao is over
public interface CustomerDAO extends JpaRepository<Customer, Integer> {

}
