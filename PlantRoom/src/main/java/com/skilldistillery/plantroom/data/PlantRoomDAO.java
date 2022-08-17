package com.skilldistillery.plantroom.data;

import java.util.List;

import com.skilldistillery.plantroom.entities.PlantRoom;

public interface PlantRoomDAO {
	
	

	
	PlantRoom findById(int id);
	
	List<PlantRoom> findAll();
	
	public boolean deletePlant(int id);
	
	public PlantRoom create(PlantRoom plant);
	
	public PlantRoom update(Integer id, PlantRoom plant);
	
	public List<PlantRoom> findByKeyword(String keyword);

}
