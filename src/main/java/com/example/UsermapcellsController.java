package com.example;


/**
 * Created by abdirahmanahmed on 12/4/17.
 */

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/usermapcells")

public class UsermapcellsController {


    private UsermapCellsRepository repository;

    @Autowired
    public UsermapcellsController (UsermapCellsRepository repository) {
        this.repository = repository;
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)

    public ResponseEntity<UsermapCells> get(@PathVariable("id") long id) {
        UsermapCells usermapCells = repository.findOne(id);
        if (null == usermapCells) {
            return new ResponseEntity<UsermapCells>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<UsermapCells>(usermapCells, HttpStatus.OK);
    }

    @RequestMapping(value = "/new", method = RequestMethod.POST)
    public ResponseEntity<UsermapCells> update(@RequestBody UsermapCells usermapCells) {
        repository.save(usermapCells);
        return get(usermapCells.getId());
    }

    @RequestMapping
    public List<UsermapCells> all() {
        return repository.findAll();
    }
}
