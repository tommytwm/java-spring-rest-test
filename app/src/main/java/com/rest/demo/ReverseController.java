package com.rest.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ReverseController {
    @GetMapping("/reverse/{string}")
    public Reverse reverse(@PathVariable String string) {
        return new Reverse(string);
    }
}