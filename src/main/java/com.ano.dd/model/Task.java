package com.ano.dd.model;

import jakarta.persistence.*;
import lombok.Data;
import org.springframework.cglib.core.Local;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Data
@Table(name = "task")
public class Task {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  int id;
    private String name;
    private LocalDateTime time;
    @ManyToOne
    @JoinColumn(name = "dog_id")
    private Dog dog;
    @OneToOne
    @JoinColumn(name = "task_sub_category")
    private TaskSubCategory taskSubCategory;
}
