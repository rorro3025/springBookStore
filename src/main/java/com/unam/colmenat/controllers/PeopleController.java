package com.unam.colmenat.controllers;

import com.unam.colmenat.entities.Person;
import com.unam.colmenat.services.PersonService;
import com.unam.colmenat.services.PersonServiceImp;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api/people")
public class PeopleController {

    private final PersonService personService;

    public PeopleController(PersonServiceImp personService){
        this.personService = personService;
    }

    @GetMapping("")
    public List<Person> getAll() throws Exception{
        return personService.findAll();
    }

    @GetMapping("/{id}")
    public Person getById(@PathVariable Long id) throws Exception{
        return personService.findById(id);
    }

    @GetMapping("/search")
    public List<Person> search(@RequestParam String name) throws Exception{
        return personService.search(name);
    }

    @PostMapping("")
    public Person create(@RequestBody Person person) throws Exception{
        return personService.save(person);
    }

    @PutMapping("/update")
    public Person update(@RequestBody Person person) throws Exception{
        return personService.update(person);
    }

   @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) throws Exception{
        personService.delete(id);
    }

}
