package edu.kosta.restaurant.service;

import edu.kosta.restaurant.domain.Cook;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

public interface CookService {

    List<Cook> findAll();

    Cook saveCook(Cook cook);

    Optional<Cook> findById(long id);

    void deleteCook(Cook cook);
}