package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Guests;
import com.example.demo.repository.GuestsRepo;

	

@RestController
public class GuestController {
	
	@Autowired
	private GuestsRepo repository;
	
	@PostMapping("/addguest")
	public String addguest(@RequestBody Guests guests) {
		repository.save(guests);
		return "Added guest with id :"+guests.getId();	
	}
	
	@GetMapping("/findall")
	public List<Guests> getGuests(){
		return repository.findAll();
	}
	
	@GetMapping("/findAll/{id}")
	public java.util.Optional<Guests> getGuests(@PathVariable int id){
		return repository.findById(id);
		
	}
	@DeleteMapping()
	public String deleteguest(@PathVariable int id) {
		repository.deleteById(id);
		return " guest deleted with id :"+id;
	}
	
}
	

