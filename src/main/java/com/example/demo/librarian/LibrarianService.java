package com.example.demo.librarian;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LibrarianService {

    private final LibrarianRepository LIBRARIAN_REPOSITORY;

    @Autowired
    public LibrarianService(LibrarianRepository LIBRARIAN_REPOSITORY) {
        this.LIBRARIAN_REPOSITORY = LIBRARIAN_REPOSITORY;
    }

    public List<Librarian> getLibrarians() {
        return LIBRARIAN_REPOSITORY.findAll();
    }
}
