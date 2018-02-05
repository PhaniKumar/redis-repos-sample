/**
 * 
 */
package com.github.phanikumar.repo;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.github.phanikumar.domain.Person;

/**
 * @author phani kumar
 *
 */
public interface PersonRepository extends CrudRepository<Person, String>{

	List<Person> findByLastName(String lastName);
}
