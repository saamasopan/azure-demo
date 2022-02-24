package com.example.azure.repo;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.example.azure.entity.User;

@Repository
public interface UserRepo extends MongoRepository<User, String>{

}
