package edu.kosta.restaurant.service;

import edu.kosta.restaurant.domain.Cook;
import edu.kosta.restaurant.repository.CookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CookServiceImpl implements CookService {

    @Autowired
    CookRepository cookRepository;

    @Override
    public List<Cook> findAll() {
        return cookRepository.findAll();
    };

    @Override
    public Cook saveCook(Cook cook) {
        return cookRepository.save(cook);
    }

    @Override
    public Optional<Cook> findById(long id) {
        return cookRepository.findById(id);
    }

    @Override
    public void deleteCook(Cook cook) {
        cookRepository.delete(cook);
    }
}
