package com.pomodora.services.Pomodoraservices.beans;

import org.springframework.stereotype.Repository;
import org.springframework.data.mongodb.repository.MongoRepository;
@Repository 
public interface TaskRepository extends MongoRepository<TaskFormBean,String>{

}
