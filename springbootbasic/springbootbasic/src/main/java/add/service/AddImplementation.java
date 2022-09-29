package add.service;

import org.springframework.stereotype.Component;

@Component
public class AddImplementation  implements AddService{

	@Override
	public int sum(int x, int y) {
		// TODO Auto-generated method stub
		
		System.out.println(" to keep kids happy");
		return x+y;
	}

}
