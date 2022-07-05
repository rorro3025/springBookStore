package com.unam.colmenat.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "books")
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Book extends Base {
    @Column
    private String title;
    @Column
    private String YearOfPublisher;
    @Column
    private String genre;
    @Column
    private int numberOfPages;

    // Refresh the list of books when a new book is added
    @ManyToMany(cascade = CascadeType.REFRESH)
    private List<Author> authors = new ArrayList<>();
}
