package maestrooso.projects.soap.rest.webservice.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import maestrooso.projects.soap.rest.database.entities.Movement;
import maestrooso.projects.soap.rest.webservice.business.MovementBusiness;

@RestController
@RequestMapping(path = "/movement")
public class MovementController {
	
	@Autowired
	private MovementBusiness movementBusiness;
	
	@GetMapping("/{id}")
	Movement getInfoMovement(@PathVariable Long id) {
		return movementBusiness.movementInfoById(id);
	}
}
