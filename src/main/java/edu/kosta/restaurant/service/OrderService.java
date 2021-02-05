package edu.kosta.restaurant.service;

import edu.kosta.restaurant.domain.Order;
import edu.kosta.restaurant.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OrderService {

    @Autowired
    OrderRepository orderRepository;

    public List<Order> findAll() {
        return orderRepository.findAll();
    };

    public Optional<Order> findById(Long id) {
        return orderRepository.findById(id);
    }
}
