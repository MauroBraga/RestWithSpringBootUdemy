package br.com.mrb.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.mrb.exception.ResourceNotFoundException;
import br.com.mrb.model.Person;
import br.com.mrb.repository.PersonRepository;

@Service
public class PersonServices {
	
	@Autowired
	PersonRepository repository;
	
	public Person create (Person person) {
		return repository.save(person);
	}
	
	public Person update (Person person) {
		Person entity = this.findById(person.getId());
		
		entity.setFirstName(person.getFirstName());
		entity.setLastName(person.getLastName());
		entity.setAddress(person.getAddress());
		entity.setGender(person.getGender());
		
		return repository.save(entity);
	}
	
	public void delete(Long id) {
		Person entity = this.findById(id);
		repository.delete(entity);
	}
	
	public Person findById(Long id) {
		return repository.findById(id).orElseThrow(()-> new ResourceNotFoundException("No records found for this ID"));
	}
	
	
	public List<Person> findAll() {
		return repository.findAll();
	}


	
}