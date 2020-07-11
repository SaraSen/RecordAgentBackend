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
    @org.springframework.data.annotation.Id
    private String Id;
    private String RecordName;
    private String FolderLocation;
    private Object[] Events;
}
