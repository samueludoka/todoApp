package org.applicationsmart.service;

import org.applicationsmart.dtos.request.TaskRequest;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public interface TaskService {
    void Task(TaskRequest taskRequest);
    String setName();
    Date setDeadline();
    void Display();
}

