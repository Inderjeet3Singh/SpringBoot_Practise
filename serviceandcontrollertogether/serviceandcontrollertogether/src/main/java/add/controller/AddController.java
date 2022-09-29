package add.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import add.service.AddService;

@RestController //this is cousion of @component
public class AddController {
	
	@Autowired
	private AddService addService;
	
	//wiring of service happende only after we proved in controller
	//inout
	
	
	@GetMapping("/stepbystep") //app.get("/stepbystep",(req,res)=>{}); 
	public int sum(@RequestParam int x, @RequestParam int y) {
		//@RequestParam --th is will tell you hey get the http request
		// where there will be parameter x or y
		
		
		System.out.println(x + "did we ger input coreect "+ y);
		return addService.sum(x,y);
	
	
	}

}
