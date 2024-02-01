package org.applicationsmart.service;

import org.applicationsmart.data.repository.TaskRepository;
import org.applicationsmart.data.repository.ToDoLIstRepository;
import org.applicationsmart.dtos.request.TaskRequest;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest

class TaskServiceImplTest {
    @Autowired
    private TaskService taskService;
    @Autowired
    private TaskRepository taskRepository;
    @Autowired
    private ToDoListService toDoListService;
    @Autowired
    private ToDoLIstRepository toDoLIstRepository;
    @BeforeEach
    public void doThisBeforeEachTest(){
        taskRepository.deleteAll();
        toDoLIstRepository.deleteAll();
    }
    @Test
    public void testThatListCanBeCreated(){
        TaskRequest taskRequest = new TaskRequest();
        taskRequest.setName("tales by moon light");
        taskRequest.setTitle("before sun set on set-day");
        taskService.Task(taskRequest);
        assertEquals(1,taskRepository.count());
    }

}