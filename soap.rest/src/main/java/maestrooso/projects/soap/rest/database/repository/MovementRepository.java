package maestrooso.projects.soap.rest.database.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

import maestrooso.projects.soap.rest.database.entities.Movement;

@Component
public interface MovementRepository extends CrudRepository<Movement, Long>{
	List<Movement> findAll();
	
	Movement findOneById(Long Id);
	
	List<Movement> findByCreditCardNumber(String creditCardNumber);
}
