package edu.kosta.cnmm.repository;

import edu.kosta.cnmm.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
