package com.example.demo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Rooms;

@Repository
public interface RoomsRepo extends MongoRepository<Rooms, Integer> {

}
