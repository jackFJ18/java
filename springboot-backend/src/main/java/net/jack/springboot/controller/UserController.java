package net.jack.springboot.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import net.jack.springboot.model.User;
import net.jack.springboot.repository.UserRepository;

// agregar
@RestController

//momdificacion 
@CrossOrigin(origins = "http://localhost:3000/")
//agregar, el RequestController es el identifiador q pondremos en la URL
@RequestMapping("api/")
public class UserController {
	
	
	@Autowired
	private UserRepository userRepository;
	@GetMapping("users")
	public List<User> getUsers(){
		return this.userRepository.findAll();
	}
}
