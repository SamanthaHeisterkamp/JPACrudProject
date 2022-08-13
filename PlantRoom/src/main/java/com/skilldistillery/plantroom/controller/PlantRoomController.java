package com.skilldistillery.plantroom.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.skilldistillery.plantroom.data.PlantRoomDAO;

@Controller
public class PlantRoomController {
	
	
	
	@Autowired
	private PlantRoomDAO dao;
	
	
	@RequestMapping(path= {"/", "home.do"})
	public String home(Model model) {
		model.addAttribute("DELETEME", dao.findById(1));//debug delete later
		
		return"index";
	}

}
