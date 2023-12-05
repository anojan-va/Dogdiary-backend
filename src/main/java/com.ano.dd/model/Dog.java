package com.ano.dd.model;
import jakarta.persistence.*;
import lombok.Data;

import javax.annotation.processing.Generated;
import java.time.LocalDate;
@Entity
@Table(name = "dog")
@Data
public class Dog {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private int id;
    private String name;
    private  String colour;
    private String breed;
    private LocalDate dob;
    @ManyToOne
    private Owner owner;
}
