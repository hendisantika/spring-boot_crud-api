package com.example.demo.controller;

import com.example.demo.entity.Whisky;
import com.example.demo.service.WhiskyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

/**
 * Created by hendisantika on 6/26/17.
 */
@RestController
@RequestMapping("/api/whisky")
public class WhiskyController {
    @Autowired
    WhiskyService whiskyService;

    @RequestMapping(method = RequestMethod.GET)
    List<Whisky> getWhiskies() {
        return whiskyService.findAll();
    }

    @RequestMapping(method = RequestMethod.POST)
    @ResponseStatus(HttpStatus.CREATED)
    Whisky insertWhisky(@Validated @RequestBody Whisky whisky) {
        return whiskyService.save(whisky);
    }

    @RequestMapping(value = "{id}", method = RequestMethod.PUT)
    @ResponseStatus(HttpStatus.OK)
    Whisky updateWhisky(@PathVariable("id") Long id, @Validated @RequestBody Whisky whisky) {
        whisky.setId(id);
        return whiskyService.save(whisky);
    }

    @RequestMapping(value = "{id}", method = RequestMethod.DELETE)
    @ResponseStatus(HttpStatus.OK)
    void deleteWhisky(@PathVariable("id") Long id) {
        whiskyService.delete(id);
    }

    @RequestMapping(value = "{id}", method = RequestMethod.GET)
    Optional<Whisky> getWhisky(@PathVariable("id") Long id) {
        return whiskyService.find(id);
    }
}
