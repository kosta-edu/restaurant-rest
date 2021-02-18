package edu.kosta.restaurant.repository;

import edu.kosta.restaurant.domain.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OrderRepository extends JpaRepository<Order, Long> {
    List<Order> findAllByStateIn(List<Order.State> states);
}
