package com.skilldistillery.plantroom.entities;

import javax.persistence.Column;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "plants")
public class PlantRoom {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(name= "plant_name")
	private String plantName;
	
	public PlantRoom() {}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getPlantName() {
		return plantName;
	}

	public void setPlantName(String name) {
		this.plantName = name;
	}

	@Override
	public String toString() {
		return "PlantRoom [id=" + id + ", name=" + plantName + "]";
	}
	
	

}
