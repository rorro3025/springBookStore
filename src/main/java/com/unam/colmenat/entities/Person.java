package com.unam.colmenat.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "people")
@NoArgsConstructor
@AllArgsConstructor
@Setter @Getter
public class Person extends Base{
    @Column
    private String name;
    @Column
    private String lastName;
    @Column
    private int dni;
}
