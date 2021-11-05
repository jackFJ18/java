package net.jack.springboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import net.jack.springboot.model.User;
import net.jack.springboot.repository.UserRepository;

//
//este archivo se ejecuta like Run as Java Aplication
//

//agregar implements CommandLineRunner
//error agregar overrride
@SpringBootApplication
public class SpringbootBackendApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootBackendApplication.class, args);
		//marcador propio para visualizar estado
		System.out.println("@@@Jack App Started");
	}
	//agregar Autowired
	@Autowired
	private UserRepository userRepository;
	
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		//agregar this...
		this.userRepository.save(new User("Ramesh","fade","ramesh@gmail.com"));
		this.userRepository.save(new User("Tom","Cruise","tomC@gmail.com"));
		this.userRepository.save(new User("Tony","Stark","stark@gmail.com"));
		
	}

}
