package com.example.demo.librarian;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Optional;

public interface LibrarianRepository
        extends JpaRepository<Librarian, Integer> {

    @Query("SELECT l FROM Librarian l WHERE l.email = ?1")
    Optional<Librarian> findLibrarianByEmail(String email);
}
