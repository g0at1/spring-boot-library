package com.example.demo.librarian;

import com.example.demo.book.Book;
import com.example.demo.book.BookRepository;
import java.util.List;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class LibrarianConfig {

  @Bean
  CommandLineRunner commandLineRunner(LibrarianRepository librarianRepository,
                                      BookRepository bookRepository) {
    return args -> {
      Librarian lib1 =
          new Librarian("Michał", "Lendzion", "michal@lendzion.com", 18);
      Librarian lib2 = new Librarian("Test", "Test", "test@test.com", 18);
      Librarian lib3 =
          new Librarian("Natalia", "Zywolko", "natalia@gmail.com", 20);
      Book b1 = new Book("Lord of The Rings", "Tolkien");
      // librarianRepository.save(lib1);
      librarianRepository.saveAll(List.of(lib1, lib2, lib3));
      bookRepository.saveAll(List.of(b1));
    };
  }
}
