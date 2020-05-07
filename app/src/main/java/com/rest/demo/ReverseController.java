package com.rest.demo;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ReverseController {
    
    @ResponseStatus(value = HttpStatus.OK)
    @GetMapping(value = "/reverse/{string}")
    public Reverse reverse(@PathVariable String string) {
        return new Reverse(string);
    }
}