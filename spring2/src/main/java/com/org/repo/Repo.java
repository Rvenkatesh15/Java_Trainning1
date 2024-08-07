package com.org.repo;
import com.org.model.User;

import org.springframework.data.mongodb.repository.MongoRepository;



public interface Repo extends MongoRepository<User,Integer>{

}
