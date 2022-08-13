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
		return null;
	}

}
