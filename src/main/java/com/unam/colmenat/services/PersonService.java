package com.unam.colmenat.services;

import com.unam.colmenat.entities.Person;

import java.util.List;

public interface PersonService extends BaseService<Person, Long> {
    List<Person> search(String name) throws Exception;
}
