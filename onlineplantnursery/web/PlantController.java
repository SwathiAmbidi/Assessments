package com.ec.onlineplantnursery.web;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ec.onlineplantnursery.plant.entity.Plant;
import com.ec.onlineplantnursery.plant.service.IPlantService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@Validated
@RestController
@RequestMapping("/api")
@Api(value="My Plant Nursery")
public class PlantController {

	@Autowired
	private IPlantService service;
	
	public PlantController() {
		System.out.println("-----------");
	}
	
	@GetMapping("/home")
	public String home() {
		return "Welcome "+LocalDate.now();
	}
	@ApiOperation(value="Add Plant",response=Plant.class)
	@PostMapping("/addPlant")
	public Plant addPlant(Plant p) {
		return service.addPlant(p);
	}
	
	@ApiOperation(value="Delete Plant",response=Plant.class)
	@GetMapping("/deletePlant")
	public Plant deletePlant(Plant p) {
		return service.deletePlant(p);
	}
	
	@ApiOperation(value="view All Plants",response=Plant.class)
	@GetMapping("/viewPlants")
	public List<Plant> viewAllPlants(){
		return service.viewAllPlants();
	}
	
	@ApiOperation(value="view Plant",response=Plant.class)
	@GetMapping("/viewPlant")
	public Plant viewPlant(int plantId) {
		return service.viewPlant(plantId);
	}
	
	
	
	
	
	
}
