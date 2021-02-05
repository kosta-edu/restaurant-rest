package edu.kosta.restaurant.service;

import edu.kosta.restaurant.domain.Tablet;
import edu.kosta.restaurant.repository.TabletRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TabletService {

    @Autowired
    TabletRepository tabletRepository;

    public List<Tablet> findAll() {
        return tabletRepository.findAll();
    };

    public Tablet saveTablet(Tablet tablet) {
        return tabletRepository.save(tablet);
    }

    public Optional<Tablet> findById(long id) {
        return tabletRepository.findById(id);
    }

    public void deleteTablet(Tablet tablet) {
        tabletRepository.delete(tablet);
    }
}
