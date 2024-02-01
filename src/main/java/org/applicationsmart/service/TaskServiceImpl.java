package org.applicationsmart.service;

import org.applicationsmart.data.model.Task;
import org.applicationsmart.data.repository.TaskRepository;
import org.applicationsmart.dtos.request.TaskRequest;
import org.applicationsmart.exception.TaskExistException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

import static org.applicationsmart.utils.Mapper.map;

@Service

public class TaskServiceImpl implements TaskService{
    @Autowired
    private TaskRepository taskRepository;

    public void Task(TaskRequest taskRequest) {
        if (taskExist(taskRequest.getTitle())) throw new TaskExistException(taskRequest.getTitle() + "already Exist");
        Task task = map(taskRequest);
        taskRepository.save(task);
    }

    private boolean taskExist(String name) {
        Task foundTask = taskRepository.findTaskByTitle(name);
        return foundTask != null;
    }



    @Override
    public String setName() {
        return null;
    }

    @Override
    public Date setDeadline() {
        return null;
    }

    @Override
    public void Display() {

    }
}
