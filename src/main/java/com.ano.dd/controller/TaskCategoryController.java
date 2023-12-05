package com.ano.dd.controller;

import com.ano.dd.model.TaskCategory;
import com.ano.dd.service.TaskCategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping
public class TaskCategoryController {
    @Autowired
    TaskCategoryService taskCategoryService;

    @PostMapping("/add")
    TaskCategory addTaskCategory(@RequestBody TaskCategory taskCategory){
        return taskCategoryService.addTaskCategory(taskCategory);
    }
    @PostMapping("/update")
    TaskCategory updateTaskCategory(@RequestBody TaskCategory taskCategory){
        return taskCategoryService.updateTaskCategory(taskCategory);
    }

    @DeleteMapping("/delete")
    void deleteTaskCategory(int id){
        taskCategoryService.deleteTaskCategory(id);
    }

    @GetMapping("/list")
    List<TaskCategory> getTaskCategoryList(){
        return taskCategoryService.getTaskCategoryList();
    }
}
