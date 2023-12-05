package com.ano.dd.controller;

import com.ano.dd.model.Owner;
import com.ano.dd.model.Task;
import com.ano.dd.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/task")
public class TaskController {

    @Autowired
    TaskService taskService;
    @PostMapping("/add")
    Task addTask(@RequestBody Task task){
        return taskService.saveTask(task);
    }

    @PostMapping("/update")
    Task updateTask(@RequestBody Task task){
        return taskService.updateTask(task);
    }

    @DeleteMapping("/delete")
    void deleteTask(int id){
        taskService.deleteTask(id);
    }

    @GetMapping("/list")
    List<Task> getTaskList(String dogId){
        return taskService.getTaskList(dogId);
    }

}
