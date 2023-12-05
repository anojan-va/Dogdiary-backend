package com.ano.dd.repository;

import com.ano.dd.model.TaskCategory;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskCategoryRepository extends JpaRepository<TaskCategory,Integer> {
}
