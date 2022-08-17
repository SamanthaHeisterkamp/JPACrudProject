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
	
	@Column(name="scientific_name")
	private String scientificName;
	
	@Column(name="required_light")
	private String lightRequirement;
	
	@Column(name="water_requirement")
	private String waterRequirement;
	
	@Column(name="soil_requirement")
	private String soilRequirement;
	
	@Column(name="humidity_requirement")
	private String humidityRequirement;
	
	@Column(name="maximum_size")
	private String maximumSize;
	
	
	public PlantRoom() {}

	public int getId() {
		return id;
	}

	public String getScientificName() {
		return scientificName;
	}

	public void setScientificName(String sciencetificName) {
		this.scientificName = sciencetificName;
	}

	public String getLightRequirement() {
		return lightRequirement;
	}

	public void setLightRequirement(String lightRequirement) {
		this.lightRequirement = lightRequirement;
	}

	public String getWaterRequirement() {
		return waterRequirement;
	}

	public void setWaterRequirement(String waterRequirement) {
		this.waterRequirement = waterRequirement;
	}

	public String getSoilRequirement() {
		return soilRequirement;
	}

	public void setSoilRequirement(String soilRequirement) {
		this.soilRequirement = soilRequirement;
	}

	public String getHumidityRequirement() {
		return humidityRequirement;
	}

	public void setHumidityRequirement(String humidityRequirement) {
		this.humidityRequirement = humidityRequirement;
	}

	public String getMaximumSize() {
		return maximumSize;
	}

	public void setMaximumSize(String maximumSize) {
		this.maximumSize = maximumSize;
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
		return "PlantRoom Id: " + id + " Plant name: " + plantName + " Scientific Name: " + scientificName
				+ " Light Requirement: " + lightRequirement + " Water Requirement" + waterRequirement
				+ ", soilRequirement=" + soilRequirement + ", humidityRequirement=" + humidityRequirement
				+ ", maximumSize=" + maximumSize + "]";
	}
	
	

}
