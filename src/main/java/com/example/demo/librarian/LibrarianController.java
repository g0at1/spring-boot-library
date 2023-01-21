package com.example.demo.librarian;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/v1/librarian")
public class LibrarianController {

    private final LibrarianService LIBRARIAN_SERVICE;

    @Autowired
    public LibrarianController(LibrarianService LIBRARIAN_SERVICE) {
        this.LIBRARIAN_SERVICE = LIBRARIAN_SERVICE;
    }

    @GetMapping
    public List<Librarian> getLibrarians() {
        return LIBRARIAN_SERVICE.getLibrarians();
    }

}
