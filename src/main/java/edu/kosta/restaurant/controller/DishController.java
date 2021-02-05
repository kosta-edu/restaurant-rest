package edu.kosta.restaurant.controller;

import edu.kosta.restaurant.domain.Dish;
import edu.kosta.restaurant.dto.DishUpdateRequest;
import edu.kosta.restaurant.mapper.DishMapper;
import edu.kosta.restaurant.service.DishService;
import org.mapstruct.factory.Mappers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.NoSuchElementException;

@RestController
@RequestMapping("/dishes")
public class DishController {

    @Autowired
    DishService dishService;

    @GetMapping
    public List<Dish> getList() {
        return dishService.findAll();
    }

    @PostMapping
    public Dish setDish(@RequestBody Dish dish) {
        return dishService.saveDish(dish);
    }

    @PutMapping("/{id}")
    public Dish updateDish(@PathVariable("id") long id, @Valid @RequestBody DishUpdateRequest request) {
        Dish dish = dishService.findById(id).orElseThrow(NoSuchElementException::new);

        DishMapper mapper = Mappers.getMapper(DishMapper.class);
        mapper.updateRequestToDish(request, dish);

        return dishService.saveDish(dish);
    }

    @DeleteMapping("/{id}")
    public void deleteDish(@PathVariable("id") long id) {
        Dish dish = dishService.findById(id).orElseThrow(NoSuchElementException::new);
        dishService.deleteDish(dish);
    }
}
