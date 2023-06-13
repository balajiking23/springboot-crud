package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.model.Person;
import com.example.repository.PersonRepository;


@Service
public class PersonService {
	
	@Autowired
	private PersonRepository personRepository;

	public Person insert(Person person) {

		return personRepository.save(person);
	}

	public Person getPerson(Integer id) {
		return personRepository.findById(id).get();
	}

	public Person update(Person person) {
		
		return personRepository.save(person);
	}

	public String delete(Integer id) {
		
		personRepository.deleteById(id);
		
		return "person deleted ";
	}

	public List<Person> getAllPerson() {
	
		return personRepository.findAll();
	}

}
