package add;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import add.service.AddService;

@SpringBootApplication
public class TestAdd implements CommandLineRunner{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SpringApplication.run(TestAdd.class, args);

	}
	
	
	@Autowired
	private AddService  addService;

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		int result= addService.sum(2, 3);
		
		System.out.println(result);
	}

}
