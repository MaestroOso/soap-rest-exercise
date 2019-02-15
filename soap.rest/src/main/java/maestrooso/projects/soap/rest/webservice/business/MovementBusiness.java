package maestrooso.projects.soap.rest.webservice.business;

import java.math.BigDecimal;
import java.sql.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import maestrooso.projects.soap.rest.database.entities.Movement;
import maestrooso.projects.soap.rest.database.repository.MovementRepository;
import maestrooso.projects.soap.rest.webservice.models.MovementModel;

@Component
public class MovementBusiness {
	
	@Autowired
	private MovementRepository movementRepository;
	
	public List<Movement> getAll(){
		return movementRepository.findAll();
	}
	
	public Movement movementInfoById(Long Id) {
		return movementRepository.findOneById(Id);
	}
	
	public String createMovement(MovementModel m) {
		Movement newMovement = new Movement();
		newMovement.setAmount(new BigDecimal(m.getAmount()));
		newMovement.setDate(m.getDate());
		newMovement.setType(m.getType());
		movementRepository.save(newMovement);
		return "Movement Created Succesfully";
	}
	
	public String updateMovement(MovementModel m) {
		Movement movement = movementRepository.findOneById(m.getId());
		if(movement != null) {
			movement.setAmount(new BigDecimal(m.getAmount()));
			movement.setDate(m.getDate());
			movement.setType(m.getType());
			movementRepository.save(movement);
			return "Succesful";
		}
		return "Movement Doesn't Exist";
	}
	
	public String deleteMovement(Long id) {
		Movement movement = movementRepository.findOneById(id);
		if(movement != null) {
			movementRepository.delete(movement);
			return "Succesful";
		}
		return "Movement Doesn't Exist";
	}
	
}
