package add.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController //this is cousion of @component
public class AddController {
	
	
	@GetMapping("/stepbystep") //app.get("/stepbystep",(req,res)=>{}); 
	public int sum(@RequestParam int x, @RequestParam int y) {
		//@RequestParam --this will tell you hey get the http request
		// where there will be parameter x or y
		
		
		System.out.println(x + "did we ger input coreect "+ y);
		return 44;
	
	
	}

}
