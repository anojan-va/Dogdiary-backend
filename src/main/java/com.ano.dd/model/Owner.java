package com.ano.dd.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Data
@Table(name = "owner")
public class Owner {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private int id;
    private String name;
    private  String address;
    private  String phone;
    @OneToMany(mappedBy = "owner")
    private List<Dog> dog;

}
