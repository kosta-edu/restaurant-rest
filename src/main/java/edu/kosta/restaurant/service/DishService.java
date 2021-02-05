package edu.kosta.restaurant.service;

import edu.kosta.restaurant.domain.Dish;
import edu.kosta.restaurant.repository.DishRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DishService {

    @Autowired
    DishRepository dishRepository;

    public List<Dish> findAll() {
        return dishRepository.findAll();
    };

    public Dish saveDish(Dish dish) {
        return dishRepository.save(dish);
    }

    public Optional<Dish> findById(long id) {
        return dishRepository.findById(id);
    }

    public void deleteDish(Dish dish) {
        dishRepository.delete(dish);
    }
}
