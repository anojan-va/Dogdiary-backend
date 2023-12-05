package com.ano.dd.service;

import com.ano.dd.model.TaskCategory;

import java.util.List;

public interface TaskCategoryService {
    TaskCategory addTaskCategory(TaskCategory taskCategory);
    TaskCategory updateTaskCategory(TaskCategory taskCategory);
    void deleteTaskCategory(int id);
    List<TaskCategory> getTaskCategoryList();
}
