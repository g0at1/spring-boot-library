package com.example.demo.librarian;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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

  @PostMapping
  public void addNewLibrarian(@RequestBody Librarian librarian) {
    LIBRARIAN_SERVICE.addNewLibrarian(librarian);
  }

  @DeleteMapping(path = "{librarianId}")
  public void
  deleteLibrarian(@PathVariable("librarianId") Integer librarianId) {
    LIBRARIAN_SERVICE.deleteLibrarian(librarianId);
  }
}
