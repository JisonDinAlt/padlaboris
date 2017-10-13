package com.example.padlaboris;

import org.springframework.data.repository.CrudRepository;


public interface PersonRepository extends CrudRepository<Person, String> {
}