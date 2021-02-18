package edu.kosta.restaurant.repository;

import edu.kosta.restaurant.domain.OrderDishes;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderDishesRepository extends JpaRepository<OrderDishes, Long> {
}
