package com.skilldistillery.plantroom.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.skilldistillery.plantroom.data.PlantRoomDAO;
import com.skilldistillery.plantroom.entities.PlantRoom;

@Controller
public class PlantRoomController {
	
	
	
	@Autowired
	private PlantRoomDAO dao;
	
	@RequestMapping(path= "/", method = RequestMethod.GET)
	public String index() {
		return "index";
	}
	
	
	@RequestMapping(path = "getPlant.do")
	public String showPlant(Integer id, Model model) {
		PlantRoom plant = dao.findById(id);
		model.addAttribute("plant", plant);
		return "plant/show";
	}

	@RequestMapping(path = "getList.do", method = RequestMethod.GET)
	public String plantList(Model model) {
		List<PlantRoom> plantList = dao.findAll();
		model.addAttribute("plants", plantList);
		return "plant/plantList";
	}
	
	@RequestMapping(path = "deletePlant.do", method = RequestMethod.GET)
	public ModelAndView deletePlant(@RequestParam("plants") int id, Model model) {
	ModelAndView mv = new ModelAndView();
	boolean result = dao.deletePlant(id);
	mv.addObject(result);
	mv.setViewName("index");
	return mv;
	}
	
	@RequestMapping(path = "create.do")
	public String createPlant(PlantRoom plant, Integer id, Model model) {
		model.addAttribute("plant", dao.findById(id));
		return "plant/update";
	}
	
	@RequestMapping (path = "createPlantForm.do", method = RequestMethod.GET)
	public String createPlantForm(PlantRoom plant) {
		return "plant/addPlant";
		
	}
	
	@RequestMapping(path = "updatePlant.do")
	public String updatePlant(Integer id, Model model, PlantRoom plant) {
		dao.update(id, plant);
		model.addAttribute("plant", plant);
		return "plant/show";
	}
	
	@RequestMapping(path = "editPlant.do")
	public String editPlant(PlantRoom plant, Integer id, Model model) {
		model.addAttribute("plant", dao.findById(id));
		return "plant/update";
	}
	
	@RequestMapping(path = "getSearch.do", method = RequestMethod.GET)
	public String plantSearch(String keyword, Model model) {
		List <PlantRoom> plantList = dao.findByKeyword(keyword);
	model.addAttribute("plant", plantList);
	return "plant/plantList";
}
}