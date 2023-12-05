package com.ano.dd.service;

import com.ano.dd.model.TaskSubCategory;

import java.util.List;

public interface TaskSubCategoryService {
    TaskSubCategory addTaskSubCategory(TaskSubCategory taskSubCategory);
    TaskSubCategory updateTaskSubCategory(TaskSubCategory taskSubCategory);
    void deleteTaskSubCategory(int id);
    List<TaskSubCategory> getTaskSubCategoryList();
}
