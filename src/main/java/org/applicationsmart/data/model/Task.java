package org.applicationsmart.data.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Data
@Document
public class Task {
    @Id
    private String id;
    private String name;
    private String title;
}
