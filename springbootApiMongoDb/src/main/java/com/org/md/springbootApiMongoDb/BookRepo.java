package com.org.md.springbootApiMongoDb;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface BookRepo extends MongoRepository<Book,Integer>{

}
