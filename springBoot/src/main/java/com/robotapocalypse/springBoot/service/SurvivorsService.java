package com.robotapocalypse.springBoot.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.robotapocalypse.springBoot.bean.Survivors;
import com.robotapocalypse.springBoot.controller.AddResponse;
import com.robotapocalypse.springBoot.repository.SurvivorsRepository;

@Service
public class SurvivorsService {
	@Autowired
	public SurvivorsRepository survivorRepo;
	
	public List<Survivors> getAllSurvivors() {
		return survivorRepo.findAll();
	}
	
	public List<Survivors> getInfectedSurvivors() {
		List <Survivors> totalSurvivors = survivorRepo.findAll();
		List <Survivors> infectedSurvivors = new ArrayList<>();
		for (Survivors survivor: totalSurvivors) {
			if(survivor.isInfected()) {
				infectedSurvivors.add(survivor);
			}
		}
		return infectedSurvivors;
	}
	
	public String getPercentageInfectedSurvivors() {
		List <Survivors> totalSurvivors = survivorRepo.findAll();
		List <Survivors> infectedSurvivors = new ArrayList<>();
		for (Survivors survivor: totalSurvivors) {
			if(survivor.isInfected()) {
				infectedSurvivors.add(survivor);
			}
		}
		float totalSurvivorsSize = totalSurvivors.size();
		float infectedSurvivorsSize = infectedSurvivors.size();
		float percentage = ((infectedSurvivorsSize / totalSurvivorsSize) * 100);
		return percentage+"%";
	}
	
	public List<Survivors> getnonInfectedSurvivors() {
		List <Survivors> totalSurvivors = survivorRepo.findAll();
		List <Survivors> noninfectedSurvivors = new ArrayList<>();
		for (Survivors survivor: totalSurvivors) {
			if(!(survivor.isInfected())) {
				noninfectedSurvivors.add(survivor);
			}
		}
		return noninfectedSurvivors;
	}
	
	public String getPercentagenonInfectedSurvivors() {
		List <Survivors> totalSurvivors = survivorRepo.findAll();
		List <Survivors> noninfectedSurvivors = new ArrayList<>();
		for (Survivors survivor: totalSurvivors) {
			if(!(survivor.isInfected())) {
				noninfectedSurvivors.add(survivor);
			}
		}
		float totalSurvivorsSize = totalSurvivors.size();
		float noninfectedSurvivorsSize = noninfectedSurvivors.size();
		float percentage = ((noninfectedSurvivorsSize / totalSurvivorsSize) * 100);
		return percentage+"%";
	}

	public Survivors survivorRegistration(Survivors survivor) {
		survivorRepo.save(survivor);
		return survivor;		
	}

	public ResponseEntity<Survivors> updateSurvivor(Integer id, Survivors survivor) {
		try {
		survivorRepo.save(survivor);
		return new ResponseEntity<Survivors>(survivor, HttpStatus.OK);
		}
		catch(Exception e) {
		return new ResponseEntity<>(HttpStatus.CONFLICT);
		}
	}

	public AddResponse deleteSurvivor(Integer id) {
		survivorRepo.deleteById(id);
		AddResponse message = new AddResponse();
		message.setMsg("Survivor Deleted Successfully");
		message.setId(id);
		return message;
	}

}
