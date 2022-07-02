package com.unam.colmenat.controllers;

import com.unam.colmenat.entities.Author;
import com.unam.colmenat.services.AuthorServiceImp;
import com.unam.colmenat.services.PersonServiceImp;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api/author")
public class AuthorController {

    private final AuthorServiceImp personService;

    public AuthorController(AuthorServiceImp personService) {
        this.personService = personService;
    }

    @GetMapping("")
    public List<Author> getAll() throws Exception{
       return personService.findAll();
    }

    @GetMapping("/{id}")
   public Author getById(@PathVariable Long id) throws Exception{
       return personService.findById(id);
   }

   @PostMapping("")
    public Author create(@RequestBody Author author) throws Exception{
        return personService.save(author);
   }

   @PutMapping("/update")
    public Author update(@RequestBody Author author) throws Exception{
       return personService.update(author);
   }

   @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) throws Exception{
       personService.delete(id);
   }
}
