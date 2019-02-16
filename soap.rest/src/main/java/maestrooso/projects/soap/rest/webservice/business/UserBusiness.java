package maestrooso.projects.soap.rest.webservice.business;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import maestrooso.projects.soap.rest.database.entities.User;
import maestrooso.projects.soap.rest.database.repository.UserRepository;

@Component
public class UserBusiness {
	
	@Autowired
	private UserRepository userRepository;
	
	public List<User> getAll(){
		return userRepository.findAll();
	}
}
