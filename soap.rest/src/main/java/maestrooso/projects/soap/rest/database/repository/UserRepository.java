package maestrooso.projects.soap.rest.database.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

import maestrooso.projects.soap.rest.database.entities.User;

@Component
public interface UserRepository extends CrudRepository<User, Long>{
	List<User> findAll();
}
