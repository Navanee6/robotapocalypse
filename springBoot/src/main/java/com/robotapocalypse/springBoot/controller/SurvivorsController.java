package com.robotapocalypse.springBoot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.robotapocalypse.springBoot.bean.Survivors;
import com.robotapocalypse.springBoot.service.SurvivorsService;

@RestController
public class SurvivorsController {
	
	@Autowired
	private SurvivorsService survivorService;
	
	@GetMapping("/survivors")
	public List<Survivors> getAllSurvivors() {
		return survivorService.getAllSurvivors();
	}
	
	@GetMapping("/infectedSurvivors")
	public List<Survivors> getInfectedSurvivors() {
		return survivorService.getInfectedSurvivors();
	}
	
	@GetMapping("/infectedSurvivorsPercentage")
	public String getPercentageInfectedSurvivors() {
		return survivorService.getPercentageInfectedSurvivors();
	}
	
	@GetMapping("/noninfectedSurvivors")
	public List<Survivors> getnonInfectedSurvivors() {
		return survivorService.getnonInfectedSurvivors();
	}
	
	@GetMapping("/noninfectedSurvivorsPercentage")
	public String getPercentagenonInfectedSurvivors() {
		return survivorService.getPercentagenonInfectedSurvivors();
	}

	@RequestMapping(method = RequestMethod.POST, value="/survivorRegitsry")
	public Survivors survivorRegistration(@RequestBody Survivors survivor) {
		 return survivorService.survivorRegistration(survivor);
	}
	
	@RequestMapping(method = RequestMethod.PUT, value="/survivors/{id}")
	public ResponseEntity<Survivors> updateSurvivor(@PathVariable Integer id, @RequestBody Survivors survivor) {
		return survivorService.updateSurvivor(id, survivor);
	}
	
	@DeleteMapping("/deleteSurvivors/{id}")
	public AddResponse deleteSurvivor(@PathVariable Integer id) {
		return survivorService.deleteSurvivor(id);
	}
	
}
