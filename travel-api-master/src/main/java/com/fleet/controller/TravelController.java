package com.fleet.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fleet.model.TravelHistory;
import com.fleet.model.TravelRepo;



@RestController
public class TravelController {

	@Autowired
	private TravelRepo travelRepo;
	
	@RequestMapping("/")
	public String Hello() {
		return "hello";
	}
	
	@GetMapping("travelHistory")
	public List<TravelHistory> travelHistroy(){
		return travelRepo.findAll();
	}
	
	@PostMapping("insertTravelHistory")
	public TravelHistory addTravelHistory(@RequestBody TravelHistory travelHistory) {
	return travelRepo.save(travelHistory);
	}
	
	@GetMapping("pendingTravelRequest/{request}")
	public TravelHistory travelRequest(@PathVariable String request) {
		return travelRepo.finfByRequest(request);
	}
	
	
//	@PostMapping("/travelHys/add-follow-up") 
//    public TravelHistory addFollowUp(@RequestBody TravelHistory followUp) {
//    return travelRepo.save(followUp);
//    }
	
}
