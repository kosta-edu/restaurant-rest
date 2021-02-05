package edu.kosta.restaurant.controller;

import edu.kosta.restaurant.domain.Tablet;
import edu.kosta.restaurant.service.TabletService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.NoSuchElementException;

@RestController
@RequestMapping("/tablets")
public class TabletController {

    @Autowired
    TabletService tabletService;

    @GetMapping
    public List<Tablet> getList() {
        return tabletService.findAll();
    }

    @PostMapping
    public Tablet setDish(@RequestBody Tablet tablet) {
        return tabletService.saveTablet(tablet);
    }

    @PutMapping("/{id}")
    public Tablet updateDish(@PathVariable("id") long id, @Valid @RequestBody Tablet request) {
        Tablet tablet = tabletService.findById(id).orElseThrow(NoSuchElementException::new);
        tablet.setLocation(request.getLocation());
        return tabletService.saveTablet(tablet);
    }

    @DeleteMapping("/{id}")
    public void deleteDish(@PathVariable("id") long id) {
        Tablet dish = tabletService.findById(id).orElseThrow(NoSuchElementException::new);
        tabletService.deleteTablet(dish);
    }
}
