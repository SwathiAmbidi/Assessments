package com.ec.onlineplantnursery.web;

import java.time.LocalDate;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
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
		return "Welcome to Nursery App "+LocalDate.now();
	}
	@ApiOperation(value="Add Plant",response=Plant.class)
	@PostMapping("/addPlant")
	public Plant addPlant(@Valid @RequestBody Plant p) {
		return service.addPlant(p);
	}
	
	@ApiOperation(value="Updating a plant",response = Plant.class)
	@PutMapping("/updatePlant")
	public Plant updatePlant(@RequestBody Plant plant) {
		return service.updatePlant(plant);
	}
	
	@ApiOperation(value="Delete Plant",response=Plant.class)
	@GetMapping("/deletePlant")
	public Plant deletePlant(@RequestBody Plant p) {
		return service.deletePlant(p);
	}
	
	@ApiOperation(value="view All Plants",response=Plant.class)
	@GetMapping("/viewPlants")
	public List<Plant> viewAllPlants(){
		return service.viewAllPlants();
	}
	
	@ApiOperation(value="view Plant",response=Plant.class)
	@GetMapping("/viewPlant/{plantId}")
	public Plant viewPlant(@PathVariable int plantId) {
		return service.viewPlant(plantId);
	}
	
	
	
	
	
	
}
