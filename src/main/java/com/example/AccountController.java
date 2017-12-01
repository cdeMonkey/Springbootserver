package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/accounts")

public class AccountController {

    private AccountRepository repository;

    @Autowired
    public AccountController(AccountRepository repository) {
        this.repository = repository;
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public ResponseEntity<Account> get(@PathVariable("id") Long id) {
        Account name = repository.findOne(id); /** Account Class */
        if (null == name) {
            return new ResponseEntity<Account>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<Account>(name, HttpStatus.OK);
    }

    @RequestMapping(value = "/new", method = RequestMethod.POST)
    public ResponseEntity<Account> update(@RequestBody Account name) {
        repository.save(name);
        return get(name.getId());
    }

    @RequestMapping
    public List<Account> all() {
        return repository.findAll();
    }
}
