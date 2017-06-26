package com.example.demo.repository;

import com.example.demo.entity.Whisky;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by hendisantika on 6/26/17.
 */
public interface WhiskyRepository extends JpaRepository<Whisky, Long> {
}
