package starterspringboothydrogen.chruch;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@RestController
public class ChruchApplication {

	@GetMapping("/")
	public String getMessage(){
		return "Hello World!";
	}

	public static void main(String[] args) {
		SpringApplication.run(ChruchApplication.class, args);
	}

}
