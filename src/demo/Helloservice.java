package demo;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public class Helloservice {
	
	@WebMethod
	public String hello(String name) {
		
		return "Hello:"+name;
	}
	

}
