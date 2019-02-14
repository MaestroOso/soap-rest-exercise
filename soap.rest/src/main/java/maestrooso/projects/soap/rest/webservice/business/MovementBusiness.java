package maestrooso.projects.soap.rest.webservice.business;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import maestrooso.projects.soap.rest.database.entities.Movement;
import maestrooso.projects.soap.rest.database.repository.MovementRepository;

@Component
public class MovementBusiness {
	
	@Autowired
	private MovementRepository movementRepository;
	
	public Movement movementInfoById(Long Id) {
		return movementRepository.findOneById(Id);
	}
	
}
