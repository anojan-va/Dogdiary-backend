package com.ano.dd.service;

import com.ano.dd.model.Task;

import java.util.List;

public interface TaskService {
    Task saveTask(Task task);
    Task updateTask(Task task);
    void deleteTask(int id);
    List<Task> getTaskList(String dogId);
}
