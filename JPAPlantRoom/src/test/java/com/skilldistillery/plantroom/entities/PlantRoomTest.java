package com.skilldistillery.plantroom.entities;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PlantRoomTest {
	
	private static EntityManagerFactory emf;
	private EntityManager em;
	private PlantRoom plantroom;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		emf = Persistence.createEntityManagerFactory("JPAPlantRoom");
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
		emf.close();
	}

	@BeforeEach
	void setUp() throws Exception {
		em = emf.createEntityManager();
		plantroom =em.find(PlantRoom.class, 1);
	}

	@AfterEach
	void tearDown() throws Exception {
		em.close();
		plantroom = null;
	}

	@Test
	void test_PlantRoom_entity_mapping() {
		assertNotNull(plantroom);
		assertEquals("Monstera", plantroom.getPlantName());
	}

}
