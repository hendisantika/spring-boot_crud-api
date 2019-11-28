package com.example.demo.service;

import com.example.demo.entity.Whisky;
import com.example.demo.repository.WhiskyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

/**
 * Created by hendisantika on 6/26/17.
 */
@Service
@Transactional
public class WhiskyService {
    @Autowired
    WhiskyRepository whiskyRepository;

    public List<Whisky> findAll() {
//        return whiskyRepository.findAll(new Sort(Sort.Direction.ASC, "id"));
        return whiskyRepository.findAll();
    }

    public Whisky save(Whisky whisky) {
        return whiskyRepository.save(whisky);
    }

    public void delete(Long id) {
        whiskyRepository.deleteById(id);
    }

    public Optional<Whisky> find(Long id) {
        return whiskyRepository.findById(id);
    }

}
