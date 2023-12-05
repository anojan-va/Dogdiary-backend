package com.ano.dd.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "task_category")
public class TaskCategory {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
}
