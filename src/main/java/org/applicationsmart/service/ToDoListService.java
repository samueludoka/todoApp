package org.applicationsmart.service;

import org.springframework.stereotype.Service;

@Service
public interface ToDoListService {
    String TodoList();
    void createTask();
    String removeTask();
    String renameTask();
}
