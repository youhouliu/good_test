package com.ljs.controller;


import com.ljs.pojo.Person;
import com.ljs.service.personRepositoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PersonController {


	// ls µÄ´úÂë ------
	
    @Autowired
    personRepositoryService personservice;

    @PostMapping("addPerson")
    public void addPerson(@RequestBody Person person){
        personservice.save(person);
    }

    @GetMapping("findAll")
    public List<Person> findAll(){
        return personservice.findAll();
    }

    @DeleteMapping("dele/{id}")
    public void delePerson(@PathVariable Integer id){
        personservice.deleteById(id);
    }

    @PutMapping("updatePerson")
    public void updatePerson(@RequestBody Person person){
        personservice.saveAndFlush(person);
    }

}
