package org.applicationsmart.utils;

import org.applicationsmart.data.model.Task;
import org.applicationsmart.dtos.request.TaskRequest;

public class Mapper {
    public static Task map(TaskRequest taskRequest){
        Task newTask = new Task();
        newTask.setName(taskRequest.getName());
        newTask.setTitle(taskRequest.getTitle());
        return  newTask;
    }
}
