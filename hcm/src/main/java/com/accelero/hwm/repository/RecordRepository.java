package com.accelero.hwm.repository;

import com.accelero.hwm.model.Recording;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface RecordRepository extends MongoRepository<Recording, String> {

}
