package com.rest.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ReverseController {

    /* This is the controller that handles calls to models when it is hit with the specified endpoints.
    */

    /* This method maps the URI: /reverse/{string}, where {string} is replaced with a desired string input,
    *  to call and return the Reverse object, such that what is returned is the reverse of the input.
    */

    //TODO: Unit tests
    @GetMapping("/reverse/{string}")
    public Reverse reverse(@PathVariable String string) {
        return new Reverse(string);
    }
}