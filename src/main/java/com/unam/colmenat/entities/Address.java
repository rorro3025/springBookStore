package com.unam.colmenat.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity()
@Table(name = "addresses")
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Address extends Base{
    @Column
    private String street;
    @Column
    private int number;

    @ManyToOne(optional = false)
    @JoinColumn(name = "fk_person")
    private Location location;
}
