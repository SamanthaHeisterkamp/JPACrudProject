package com.skilldistillery.plantroom.data;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.skilldistillery.plantroom.entities.PlantRoom;


@Service
@Transactional
public class PlantRoomDAOImpl implements PlantRoomDAO {
	
	@PersistenceContext
	private EntityManager em;

	@Override
	public PlantRoom findById(int id) {
			return em.find(PlantRoom.class, id);
	}

	@Override
	public List<PlantRoom> findAll() {
		String jpql = "SELECT name FROM plants";
		
		return em.createQuery(jpql, PlantRoom.class).getResultList();
	}

	@Override
	public boolean deletePlant(int id) {
		try {
			PlantRoom plant = em.find(PlantRoom.class, id);
			
			em.remove(plant);
			return true;
		}catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	@Override
	public PlantRoom create(PlantRoom plant) {
		em.persist(plant);
		em.flush();
		return plant;
	}

	@Override
	public PlantRoom update(Integer id, PlantRoom plant) {
		PlantRoom plantUpdate = em.find(PlantRoom.class, id);
		plantUpdate.setPlantName(plant.getPlantName());
		plantUpdate.setScientificName(plant.getScientificName());
		plantUpdate.setLightRequirement(plant.getLightRequirement());
		plantUpdate.setWaterRequirement(plant.getWaterRequirement());
		plantUpdate.setSoilRequirement(plant.getSoilRequirement());
		plantUpdate.setHumidityRequirement(plant.getHumidityRequirement());
		plantUpdate.setMaximumSize(plant.getMaximumSize());
		
		return plant;
	}

	@Override
	public List<PlantRoom> findByKeyword(String keyword) {
		String jpql = "SELECT p from PlantRoom p" + "WHERE p.name LIKE :keyword||'%' "
	+ "OR p.scientific_name LIKE :keyword||'%' " + "OR p.required_light LIKE :keyword||'%' "
				+ "OR p.water_requirement LIKE :keyword||'%' " + "OR p.soil_requirement LIKE :keyword||'%' "
	+ "OR p.humidity_requirement LIKE :keyword||'%'" + "OR p.maximum_size LIKE :keyword||'%'" +
				"ORDER BY p.name DESC";
		return em.createQuery(jpql, PlantRoom.class).setParameter("keyword", keyword).getResultList();
	}

}
