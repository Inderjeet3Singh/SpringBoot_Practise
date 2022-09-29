package ac.springboothwithjpa;



import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringboothwithjpaApplication implements CommandLineRunner{
    
	@Autowired
	private CustomerDAO customerDao;
	
	
	public static void main(String[] args) {
		SpringApplication.run(SpringboothwithjpaApplication.class, args);
	    System.out.println("plz dont write poems");
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		
		//how to do insert
		
//		Customer customer = new Customer(1,2,"a", "a@gmail.com");
//		customerDao.save(customer);
		
		
		//how to get all details
		
//		List<Customer> customers = customerDao.findAll();
//		
//		System.out.println(customers);
		
		//single select
		
		int customerId= 2;
		 Optional<Customer> x = customerDao.findById(customerId);
		 
		 if (x.isPresent())
		 {
			 Customer c= x.get();
			 System.out.println(c);
		 }
		 else
			 System.out.println("customer id not present ");
		
	}

}
