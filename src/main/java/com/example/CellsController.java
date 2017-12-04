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
@RequestMapping("/cells")

public class CellsController {


    private CellsRepository repository;

    @Autowired
    public CellsController(CellsRepository repository) {
        this.repository = repository;
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)

    public ResponseEntity<Cells> get(@PathVariable("id") Long id) {
        Cells cells = repository.findOne(id);
        if (null == cells) {
            return new ResponseEntity<Cells>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<Cells>(cells, HttpStatus.OK);
    }

    @RequestMapping(value = "/new", method = RequestMethod.POST)
    public ResponseEntity<Cells> update(@RequestBody Cells cells) {
        repository.save(cells);
        return get(cells.getId());
    }

    @RequestMapping
    public List<Cells> all() {
        return repository.findAll();
    }
}
