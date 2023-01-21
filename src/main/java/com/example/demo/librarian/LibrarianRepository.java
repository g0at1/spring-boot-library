package com.example.demo.librarian;

import org.springframework.data.jpa.repository.JpaRepository;

public interface LibrarianRepository
        extends JpaRepository<Librarian, Integer> {
}
