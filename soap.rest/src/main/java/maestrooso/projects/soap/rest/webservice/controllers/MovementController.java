package maestrooso.projects.soap.rest.webservice.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import maestrooso.projects.soap.rest.database.entities.Movement;
import maestrooso.projects.soap.rest.webservice.business.MovementBusiness;
import maestrooso.projects.soap.rest.webservice.models.MovementModel;

@RestController
@RequestMapping(path = "/movement")
public class MovementController {
	
	@Autowired
	private MovementBusiness movementBusiness;
	
	@GetMapping("/all")
	List<Movement> getAll(){
		return movementBusiness.getAll();
	}
	
	@GetMapping("/{id}")
	Movement getInfoMovement(@PathVariable Long id) {
		return movementBusiness.movementInfoById(id);
	}
	
	@PostMapping("/create")
	String createMovement(@RequestBody MovementModel model) {
		return movementBusiness.createMovement(model);
	}
	
	@PostMapping("/update")
	String updateMovement(@RequestBody MovementModel model) {
		return movementBusiness.updateMovement(model);
	}
	
	@PostMapping("/delete/{id}")
	String deleteMovement(@PathVariable Long id) {
		return movementBusiness.deleteMovement(id);
	}
}
