package de.rwthaachen.cbmb.Repository;


import de.rwthaachen.cbmb.Domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

public interface UserRepository extends JpaRepository<User, Integer> {

    User findByUsername(String username);

}
