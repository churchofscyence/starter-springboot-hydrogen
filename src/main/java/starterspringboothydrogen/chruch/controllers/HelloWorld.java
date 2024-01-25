package starterspringboothydrogen.chruch.controllers;


import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class HelloWorld {
	
	@GetMapping("/")
	public String sayHello() {
		return "Hello World!";
	}

}
