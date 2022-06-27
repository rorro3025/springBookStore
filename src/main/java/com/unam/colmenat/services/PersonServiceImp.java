package com.unam.colmenat.services;

import com.unam.colmenat.entities.Person;
import com.unam.colmenat.repositories.BaseRepository;
import com.unam.colmenat.repositories.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class PersonServiceImp extends BaseServiceImp<Person,Long> implements PersonService{

    @Autowired
    private PersonRepository personRepository;


    public PersonServiceImp(BaseRepository<Person, Long> repository) {
        super(repository);
    }
}
