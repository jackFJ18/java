package net.jack.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import net.jack.springboot.model.User;

//agregar extends jpa
//Jpa<T,ID>
//agregar @Repository  

@Repository
public interface UserRepository  extends JpaRepository<User,Long>{

}
