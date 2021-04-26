package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Rooms;
import com.example.demo.repository.RoomsRepo;

@RestController
public class RoomController {
	@Autowired
	private RoomsRepo roomrepository;
	
	@PostMapping("/addroom")
	public String addroom(@RequestBody Rooms rooms) {
		roomrepository.save(rooms);
		return "Added room with id :"+rooms.getId();
	}
	
	@GetMapping("/findallrooms")
	public List<Rooms> getRooms(){
		return roomrepository.findAll();
	}
	@GetMapping("/findrooms/{id}")
	public Optional<Rooms> getRooms(@PathVariable int id){
		return roomrepository.findById(id);
	}
	@DeleteMapping("/deleteroom")
	public String deleterooms(@PathVariable int id) {
		roomrepository.deleteById(id);
		return " room deleted with id :"+id;
	}

}
