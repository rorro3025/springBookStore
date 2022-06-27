package com.unam.colmenat.repositories;

import com.unam.colmenat.entities.Author;
import org.springframework.stereotype.Repository;

@Repository
public interface AuthorRepository extends BaseRepository<Author, Long> {
}
