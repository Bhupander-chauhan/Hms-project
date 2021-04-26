package com.example.demo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;



import com.example.demo.model.Guests;

public interface GuestsRepo extends MongoRepository<Guests, Integer>{
	

}
