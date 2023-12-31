package it.SpringDataJPA.application.repository;

import it.SpringDataJPA.application.model.User;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface UserRepository extends CrudRepository<User, Long> {

    List<User> getUserByLastNameContaining(String string);

}
