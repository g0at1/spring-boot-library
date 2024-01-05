package com.example.demo.librarian;

import jakarta.persistence.*;

@Entity(name = "Librarian")
@Table(name = "librarian", uniqueConstraints =
                           {
                             @UniqueConstraint(name = "librarian_email_unique",
                                               columnNames = "email")
                           })
public class Librarian {

  @Id
  @SequenceGenerator(name = "librarian_sequence",
                     sequenceName = "librarian_sequence", allocationSize = 1)
  @GeneratedValue(strategy = GenerationType.SEQUENCE,
                  generator = "librarian_sequence")
  protected Integer id;

  @Column(name = "name", nullable = false, columnDefinition = "TEXT")
  protected String name;

  @Column(name = "surname", nullable = false, columnDefinition = "TEXT")
  protected String surname;

  @Column(name = "email", nullable = false, columnDefinition = "TEXT")
  protected String email;

  @Column(name = "age") protected Integer age;

  public Librarian(Integer id, String name, String surname, String email,
                   Integer age) {
    this.id = id;
    this.name = name;
    this.surname = surname;
    this.email = email;
    this.age = age;
  }

  public Librarian(String name, String surname, String email, Integer age) {
    this.name = name;
    this.surname = surname;
    this.email = email;
    this.age = age;
  }

  public Librarian() {}

  public Integer getId() { return id; }

  public void setId(Integer id) { this.id = id; }

  public String getName() { return name; }

  public void setName(String name) { this.name = name; }

  public String getSurname() { return surname; }

  public void setSurname(String surname) { this.surname = surname; }

  public String getEmail() { return email; }

  public void setEmail(String email) { this.email = email; }

  public Integer getAge() { return age; }

  public void setAge(Integer age) { this.age = age; }

  @Override
  public String toString() {
    return "Librarian{"
        + "id=" + id + ", name='" + name + '\'' + ", surname='" + surname +
        '\'' + ", email='" + email + '\'' + ", age=" + age + '}';
  }
}
