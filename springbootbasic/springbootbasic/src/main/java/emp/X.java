package emp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class X {

	
	public X() {
		System.out.println("x object created");
	}
	
	@Autowired
	public void setY(Y obj) {
		System.out.println(" y wired in x");
		
	}
	
	@Autowired
	public void f3() {
		System.out.println("f3 at work");
	}
	
	
}
