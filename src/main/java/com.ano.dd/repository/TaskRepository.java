package com.ano.dd.repository;

import com.ano.dd.model.Task;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TaskRepository extends JpaRepository<Task, Integer> {
   // List<Task> findAllByDogId(String dogId);
}
