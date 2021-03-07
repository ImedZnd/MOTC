package tn.utm.isi.imd.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import tn.utm.isi.imd.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long>  {
	User findByUsername(String username);
}
