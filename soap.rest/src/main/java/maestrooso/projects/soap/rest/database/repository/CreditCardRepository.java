package maestrooso.projects.soap.rest.database.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

import maestrooso.projects.soap.rest.database.entities.CreditCard;

@Component
public interface CreditCardRepository extends CrudRepository<CreditCard, Long>{
	List<CreditCard> findAll();
}
