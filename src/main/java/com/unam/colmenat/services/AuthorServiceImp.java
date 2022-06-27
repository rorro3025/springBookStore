package com.unam.colmenat.services;

import com.unam.colmenat.entities.Author;
import com.unam.colmenat.repositories.AuthorRepository;
import com.unam.colmenat.repositories.BaseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AuthorServiceImp extends BaseServiceImp<Author, Long> implements AuthorService {

    @Autowired
    private AuthorRepository authorRepository;

    public AuthorServiceImp(BaseRepository<Author, Long> repository) {
        super(repository);
    }
}
