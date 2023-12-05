package com.ano.dd.model;

import jakarta.persistence.*;
import lombok.Data;
import org.springframework.web.service.annotation.GetExchange;

@Entity
@Data
@Table(name = "task_sub_category")
public class TaskSubCategory {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    @ManyToOne
    @JoinColumn(name = "task_category_id")
    private TaskCategory taskCategory;

}
