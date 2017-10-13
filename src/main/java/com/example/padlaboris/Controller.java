package com.example.padlaboris;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class Controller {

private final RepositoryPerson repositoryPerson;

@Autowired
    public Controller (final RepositoryPerson repositoryPerson){
    this.repositoryPerson = repositoryPerson;
}

@RequestMapping("/PersonList")
    public List<Person> getAllList () {
        return repositoryPerson.getAllList();
}

@RequestMapping("/PersonList/{id}")
    public Person getOne (String Id) {
        return repositoryPerson.getOne(Id);
}

@RequestMapping(method = RequestMethod.POST, value = "/PersonList/{id}")
    public void addOne (@RequestBody  Person one) {
        repositoryPerson.addOne(one);
}

@RequestMapping (method = RequestMethod.PUT, value = "/PersonList/{id}" )
    public void updateOne (@RequestBody Person one) {repositoryPerson.updateOne(one);}

@RequestMapping (method = RequestMethod.DELETE, value = "/PersonList/{id}")
    public void deleteOne (@RequestBody String Id) {repositoryPerson.deleteOne(Id);}

}
