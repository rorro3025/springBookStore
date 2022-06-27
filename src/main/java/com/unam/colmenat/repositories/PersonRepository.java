package com.unam.colmenat.repositories;

import com.unam.colmenat.entities.Person;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonRepository extends BaseRepository<Person, Long> {
}

