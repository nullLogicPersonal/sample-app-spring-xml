package com.spring.service;

import java.util.List;

import com.spring.model.Person;
import com.spring.repository.MysqlPersonRepositoryImpl;
import com.spring.repository.PersonRepository;

public class PersonServiceImpl implements PersonService {
	private PersonRepository cr = new MysqlPersonRepositoryImpl();
	
	/* (non-Javadoc)
	 * @see com.spring.service.PersonService#getAllPersonInService()
	 */
	@Override
	public List<Person> getAllPersonInService(){
		return cr.getAllPerson();
	}
}
