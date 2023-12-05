package com.ano.dd.service.serviceImpl;

import com.ano.dd.model.Owner;
import com.ano.dd.model.Task;
import com.ano.dd.repository.TaskRepository;
import com.ano.dd.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TaskServiceImpl implements TaskService {
    @Autowired
    TaskRepository taskRepository;
    @Override
    public Task saveTask(Task task) {
        return taskRepository.save(task);
    }

    @Override
    public Task updateTask(Task task) {
        return taskRepository.save(task);
    }

    @Override
    public void deleteTask(int id) {
        Optional<Task> task = taskRepository.findById(id);
        if(task.isPresent()){
            taskRepository.delete(task.get());
        }else {
            ResponseEntity.notFound();
        }

    }

    @Override
    public List<Task> getTaskList(String dogId) {
       // return taskRepository.findAllByDogId(dogId);
        return null;
    }
}
