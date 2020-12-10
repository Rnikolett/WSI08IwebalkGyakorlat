package hu.wsi08i.springbootweb.wsi08ispringbootweb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Wsi08ISpringBootWebApplication {
	@RequestMapping("/")
	public String index() {return "index";};

	/*public static void main(String[] args) {
		SpringApplication.run(Wsi08ISpringBootWebApplication.class, args);
	}*/

}
