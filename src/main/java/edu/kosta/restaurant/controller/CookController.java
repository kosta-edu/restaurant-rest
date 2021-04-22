package edu.kosta.restaurant.controller;

import edu.kosta.restaurant.domain.Cook;
import edu.kosta.restaurant.dto.CookUpdateRequest;
import edu.kosta.restaurant.mapper.CookMapper;
import edu.kosta.restaurant.service.CookService;
import org.mapstruct.factory.Mappers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.NoSuchElementException;

@RestController
@RequestMapping("/cooks")
public class CookController {

    @Autowired
    CookService cookService;

    @GetMapping
    public List<Cook> getList() {
        return cookService.findAll();
    }

    @PostMapping
    public Cook setCook(@RequestBody Cook cook) {
        return cookService.saveCook(cook);
    }

    @PutMapping("/{id}")
    public Cook updateCook(@PathVariable("id") long id, @Valid @RequestBody CookUpdateRequest request) {
        Cook cook = cookService.findById(id).orElseThrow(NoSuchElementException::new);

        CookMapper mapper = Mappers.getMapper(CookMapper.class);
        mapper.updateRequestToCook(request, cook);

        return cookService.saveCook(cook);
    }

    @DeleteMapping("/{id}")
    public void deleteCook(@PathVariable("id") long id) {
        Cook cook = cookService.findById(id).orElseThrow(NoSuchElementException::new);
        cookService.deleteCook(cook);
    }
}