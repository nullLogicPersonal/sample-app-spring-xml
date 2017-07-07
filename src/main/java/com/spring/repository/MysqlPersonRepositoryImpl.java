package com.spring.repository;

import java.util.ArrayList;
import java.util.List;

import com.spring.model.Person;

public class MysqlPersonRepositoryImpl implements PersonRepository {
	
	@Override
	public List<Person> getAllPerson() {
		List<Person> persons = new ArrayList<>();
		Person person = new Person();
		person.setAge(28);
		person.setfName("Mar");
		person.setfName("Angelo");
		
		persons.add(person);
		
		return persons;
	}
	
	
	

}
