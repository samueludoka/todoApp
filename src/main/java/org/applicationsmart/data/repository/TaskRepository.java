package org.applicationsmart.data.repository;

import org.applicationsmart.data.model.Task;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface TaskRepository extends MongoRepository<Task, String> {
    Task findTaskByTitle(String title);
}
