package maestrooso.projects.soap.rest.webservice.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import maestrooso.projects.soap.rest.database.entities.CreditCard;
import maestrooso.projects.soap.rest.database.entities.User;
import maestrooso.projects.soap.rest.webservice.business.UserBusiness;

@RestController
@RequestMapping(path = "/user")
public class UserController {
	
	@Autowired
	private UserBusiness userBusiness;
	
	@GetMapping("/all")
	public List<User> getAll(){
		return userBusiness.getAll();
	}
}
