package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.Person;
import com.example.service.PersonService;

@RestController
@RequestMapping("/api/persons")
public class PersonControler {
	
	@Autowired
	
private	PersonService personService;
	
	@PostMapping("/insert")
	public ResponseEntity<?> insert(@RequestBody Person person){
		return new ResponseEntity<Person>(personService.insert(person), HttpStatus.CREATED);
	}

	@GetMapping("/get/{id}")
	public ResponseEntity<?> getPerson(@PathVariable Integer id){
		return new ResponseEntity<Person>(personService.getPerson(id),HttpStatus.OK);
	}
	
	@DeleteMapping("/delete/{id}")
	public ResponseEntity<?> delete(@PathVariable Integer id){
		return new ResponseEntity<String>(personService.delete(id),HttpStatus.OK);
	}
	
	@PutMapping("/update")
	public ResponseEntity<?> update(@RequestBody Person person){
		return new ResponseEntity<Person>(personService.update(person),HttpStatus.OK);
	}
	
	@GetMapping("/all")
	public ResponseEntity<?> allPersons(){
		return new ResponseEntity<List<Person>>(personService.getAllPerson(),HttpStatus.OK);
	}

}
