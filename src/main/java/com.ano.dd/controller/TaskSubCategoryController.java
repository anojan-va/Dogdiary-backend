package com.ano.dd.controller;

import com.ano.dd.model.TaskSubCategory;
import com.ano.dd.service.TaskSubCategoryService;
import com.ano.dd.service.TaskSubCategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping
public class TaskSubCategoryController {
    @Autowired
    TaskSubCategoryService taskSubCategoryService;

    @PostMapping("/add")
    TaskSubCategory addTaskSubCategory(@RequestBody TaskSubCategory taskSubCategory){
        return taskSubCategoryService.addTaskSubCategory(taskSubCategory);
    }
    @PostMapping("/update")
    TaskSubCategory updateTaskSubCategory(@RequestBody TaskSubCategory taskSubCategory){
        return taskSubCategoryService.updateTaskSubCategory(taskSubCategory);
    }

    @DeleteMapping("/delete")
    void deleteTaskSubCategory(int id){
        taskSubCategoryService.deleteTaskSubCategory(id);
    }

    @GetMapping("/list")
    List<TaskSubCategory> getTaskSubCategory(){
        return taskSubCategoryService.getTaskSubCategoryList();
    }
}
