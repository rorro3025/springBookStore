package com.unam.colmenat.repositories;

import com.unam.colmenat.entities.Person;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PersonRepository extends BaseRepository<Person, Long> {
    List<Person> findByNameContainingOrLastNameContaining(String name,String lastName);
    //boolean existsByDni(int dni);
    @Query(value = "SELECT p from Person p where p.name like %:name% or p.lastName like %:name%")
    List<Person> getByNameOrLastName(@Param("name") String name);

    @Query(value = "SELECT * from people where people.name like %:name% or people.lastName like %:name%", nativeQuery = true)
    List<Person> getByNameOrLastNameNative(@Param("name") String name);
}

