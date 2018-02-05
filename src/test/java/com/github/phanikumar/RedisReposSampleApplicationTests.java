package com.github.phanikumar;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.github.phanikumar.domain.Person;
import com.github.phanikumar.repo.PersonRepository;

@RunWith(SpringRunner.class)
@SpringBootTest
public class RedisReposSampleApplicationTests {

	@Autowired
	PersonRepository personRepo;
	
	@Test
	public void contextLoads() {
	}

	@Test
	public void savePerson() {
		Person person = new Person();
		person.setFistName("Pradyumna");
		person.setLastName("Bhamidipati");
		//person.setId("sku123");
		
		personRepo.save(person);
		
		System.out.println("Saved ....");
	}
	
	//@Test
	public void getByLastName() {
		List<Person> persons = personRepo.findByLastName("Bhamidipati");
		for(Person person : persons) {
			System.out.println("Person:" + person);
		}
		System.out.println("########################################################");
	}
	
	//@Test
	public void printAllPersons() {
		List<Person> persons = (List<Person>) personRepo.findAll();
		for(Person person: persons) {
			System.out.println("Person:" + person);
		}
		
		System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
	}
	
	//@Test
	public void deleteAll() {
		this.printAllPersons();
		personRepo.deleteAll();
		this.printAllPersons();
	}
}
