package com.example.padlaboris;


import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class RepositoryPerson {

private final PersonRepository personRepository;


public List<Person> getAllList () {
    List<Person> person = new ArrayList<>();
    personRepository.findAll().forEach(person::add);
    return person;
}

public void  deleteOne (String Id) {
personRepository.delete(Id);
}

public void addOne (Person one) {
personRepository.save(one);
}

public Person getOne (String Id) {
return personRepository.findOne(Id);
}

public void updateOne (Person one){
personRepository.save(one);
}
}
