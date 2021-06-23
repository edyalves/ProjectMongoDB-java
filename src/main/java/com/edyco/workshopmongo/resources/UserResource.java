package com.edyco.workshopmongo.resources;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.edyco.workshopmongo.domain.User;

@RestController
@RequestMapping(value="users")
public class UserResource {
	
	@RequestMapping(method=RequestMethod.GET)
	public ResponseEntity<List<User>> findAll(){
		User pessoa1 = new User("1", "Pessoa 1", "Pessoa1@email.com");
		User pessoa2 = new User("2", "Pessoa 2", "Pessoa2@email.com");
		List<User> list = new ArrayList<>();
		list.addAll(Arrays.asList(pessoa1,pessoa2));
		return ResponseEntity.ok().body(list);
	}

}
