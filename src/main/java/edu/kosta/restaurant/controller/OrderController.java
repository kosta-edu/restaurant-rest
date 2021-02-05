package edu.kosta.restaurant.controller;

import edu.kosta.restaurant.domain.Order;
import edu.kosta.restaurant.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/orders")
public class OrderController {

    @Autowired
    OrderService orderService;

    @GetMapping
    public List<Order> getList() {
        return orderService.findAll();
    }

    @GetMapping("/{id}")
    public Optional<Order> getList(@PathVariable("id") long id) {
        return orderService.findById(id);
    }
}
