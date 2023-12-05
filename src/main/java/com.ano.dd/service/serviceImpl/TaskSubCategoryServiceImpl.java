package com.ano.dd.service.serviceImpl;

import com.ano.dd.model.Task;
import com.ano.dd.model.TaskSubCategory;
import com.ano.dd.repository.TaskSubCategoryRepository;
import com.ano.dd.service.TaskSubCategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TaskSubCategoryServiceImpl implements TaskSubCategoryService {

    @Autowired
    TaskSubCategoryRepository taskSubCategoryRepository;
    @Override
    public TaskSubCategory addTaskSubCategory(TaskSubCategory taskSubCategory) {
        return taskSubCategoryRepository.save(taskSubCategory);
    }

    @Override
    public TaskSubCategory updateTaskSubCategory(TaskSubCategory taskSubCategory) {
        return taskSubCategoryRepository.save(taskSubCategory);
    }

    @Override
    public void deleteTaskSubCategory(int id) {
        Optional<TaskSubCategory> taskSubCategory = taskSubCategoryRepository.findById(id);
        if(taskSubCategory.isPresent()){
            taskSubCategoryRepository.delete(taskSubCategory.get());
        }else {
            ResponseEntity.notFound();
        }
    }

    @Override
    public List<TaskSubCategory> getTaskSubCategoryList() {
        return taskSubCategoryRepository.findAll();
    }
}
