package org.concrete.cadastro;

import org.springframework.data.repository.CrudRepository;
import org.concrete.cadastro.User;

public interface UserRepository extends CrudRepository<User, Integer> {

}
