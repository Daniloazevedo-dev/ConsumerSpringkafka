package br.com.springkafka.domain;


import jakarta.persistence.*;

import java.util.List;

@Entity
public class People {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;
    private String name;
    private String cpf;

    @OneToMany(mappedBy = "people")
    private List<Book> books;

}
