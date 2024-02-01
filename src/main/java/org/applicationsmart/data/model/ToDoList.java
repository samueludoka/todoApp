package org.applicationsmart.data.model;

import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document
public class ToDoList {
    private String id;
    private String topic;

}
