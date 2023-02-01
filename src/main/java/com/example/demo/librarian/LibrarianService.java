package com.example.demo.librarian;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

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

    public void addNewLibrarian(Librarian librarian) {
        Optional<Librarian> librarianOptional = LIBRARIAN_REPOSITORY
                .findLibrarianByEmail(librarian.getEmail());
        if (librarianOptional.isPresent()) {
            throw new IllegalStateException(
                    "Email taken"
            );
        }
        LIBRARIAN_REPOSITORY.save(librarian);
    }

    public void deleteLibrarian(Integer librarianId) {
        boolean exists = LIBRARIAN_REPOSITORY.existsById(librarianId);
        if (!exists) {
            throw new IllegalStateException(
                    "Librarian with id: " + librarianId + " does not exist"
            );
        }
        LIBRARIAN_REPOSITORY.deleteById(librarianId);
    }
}
