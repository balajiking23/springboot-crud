package com.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.example.model.Person;

@EnableJpaRepositories
public interface PersonRepository extends JpaRepository<Person , Integer> {

}
