package edu.kosta.restaurant.service;

import edu.kosta.restaurant.domain.OrderDishes;
import edu.kosta.restaurant.repository.OrderDishesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class OrderDishesService {

    @Autowired
    OrderDishesRepository orderDishesRepository;

    public Optional<OrderDishes> findById(Long id) {
        return orderDishesRepository.findById(id);
    }

    public OrderDishes saveOrderDishes(OrderDishes orderDishes) {
        return orderDishesRepository.save(orderDishes);
    }

    public void deleteOrderDishes(OrderDishes orderDishes) {
        orderDishesRepository.delete(orderDishes);
    }
}
