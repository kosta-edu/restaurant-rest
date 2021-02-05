package edu.kosta.restaurant.repository;

import edu.kosta.restaurant.domain.Cook;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CookRepository extends JpaRepository<Cook, Long> {
}
