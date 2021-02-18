package edu.kosta.restaurant.service;

import edu.kosta.restaurant.domain.Order;
import edu.kosta.restaurant.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class OrderService {

    @Autowired
    OrderRepository orderRepository;

    public List<Order> findAll() {
        return orderRepository.findAll();
    };

    public List<Order> findAllByStateIn() {
        List<Order.State> states = new ArrayList<>();
        states.add(Order.State.READY);
        states.add(Order.State.COOKING);
        return orderRepository.findAllByStateIn(states);
    }

    public Order saveOrder(Order order) {
        return orderRepository.save(order);
    }

    public Optional<Order> findById(long id) {
        return orderRepository.findById(id);
    }

    public void deleteOrder(Order order) {
        orderRepository.delete(order);
    }
}
