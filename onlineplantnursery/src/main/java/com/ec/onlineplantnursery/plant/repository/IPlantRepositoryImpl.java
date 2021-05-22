package com.ec.onlineplantnursery.plant.repository;

import java.util.List;

import javax.websocket.Session;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ec.onlineplantnursery.plant.entity.Plant;

@Repository
public class IPlantRepositoryImpl implements IPlantRepository {

	@Autowired
	private SessionFactory sessionFactory;
	
	
	protected Session getCurrentSession() {
		return (Session) sessionFactory.getCurrentSession();
	}
	
	
	
	@Override
	public Plant addPlant(Plant plant) {
		
		return null;
	}

	@Override
	public Plant updatePlant(Plant plant) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Plant deletePlant(Plant plant) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Plant viewPlant(int plantId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Plant viewPlant(String commonName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Plant> viewAllPlants() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Plant> viewAllPlants(String typeOfPlant) {
		// TODO Auto-generated method stub
		return null;
	}

}
