package com.pomodora.services.Pomodoraservices.beans;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface SignupRepository extends MongoRepository<SignupFormBean, String> {

}
