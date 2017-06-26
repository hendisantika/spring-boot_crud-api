package com.example.demo.service;

import com.example.demo.entity.Whisky;
import com.example.demo.repository.WhiskyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

/**
 * Created by hendisantika on 6/26/17.
 */
@Service
@Transactional
public class WhiskyService {
    @Autowired
    WhiskyRepository whiskyRepository;

    public List<Whisky> findAll() {
        return whiskyRepository.findAll(new Sort(Sort.Direction.ASC, "id"));
    }

    public Whisky save(Whisky whisky) {
        return whiskyRepository.save(whisky);
    }

    public void delete(Long id) {
        whiskyRepository.delete(id);
    }

    public Whisky find(Long id) {
        return whiskyRepository.findOne(id);
    }

}
