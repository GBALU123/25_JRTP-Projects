package in.ashokit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.stereotype.Service;

import in.ashokit.service.PersonService;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = 
				SpringApplication.run(Application.class, args);
	
		PersonService service = context.getBean(PersonService.class);
		
		//service.savePerson();
		//service.getperson();
		
		//service.getpassport();
		
		service.deleteperson();
	}
	
	

}
