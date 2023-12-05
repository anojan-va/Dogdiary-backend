package com.ano.dd.service.serviceImpl;

import com.ano.dd.model.Task;
import com.ano.dd.model.TaskCategory;
import com.ano.dd.repository.TaskCategoryRepository;
import com.ano.dd.service.TaskCategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TaskCategoryServiceImpl implements TaskCategoryService {
    @Autowired
    TaskCategoryRepository taskCategoryRepository;
    @Override
    public TaskCategory addTaskCategory(TaskCategory taskCategory) {
        return taskCategoryRepository.save(taskCategory);
    }

    @Override
    public TaskCategory updateTaskCategory(TaskCategory taskCategory) {
        return taskCategoryRepository.save(taskCategory);
    }

    @Override
    public void deleteTaskCategory(int id) {
        Optional<TaskCategory> taskCategory = taskCategoryRepository.findById(id);
        if(taskCategory.isPresent()){
            taskCategoryRepository.delete(taskCategory.get());
        }else {
            ResponseEntity.notFound();
        }
    }

    @Override
    public List<TaskCategory> getTaskCategoryList() {
        return taskCategoryRepository.findAll();
    }
}
