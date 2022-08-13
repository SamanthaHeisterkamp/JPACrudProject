package com.skilldistillery.plantroom.data;

import java.util.List;

import com.skilldistillery.plantroom.entities.PlantRoom;

public interface PlantRoomDAO {
	
	
	PlantRoom findById(int id);
	List<PlantRoom> findAll();

}
