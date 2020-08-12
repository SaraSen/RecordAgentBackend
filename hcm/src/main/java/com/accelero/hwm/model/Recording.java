package com.accelero.hwm.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Getter
@Setter
@ToString
@Document(collection = "Recordings")
public class Recording {
    @Id
    private int id;
    private String recordname;
    private String folderlocation;
    private Object[] events;
}
