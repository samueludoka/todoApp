package org.applicationsmart.data.repository;

import org.applicationsmart.data.model.ToDoList;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ToDoLIstRepository extends MongoRepository <ToDoList, String>{
    ToDoList findByTopic(String topic);

}
