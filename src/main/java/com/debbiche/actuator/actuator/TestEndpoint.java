package com.debbiche.actuator.actuator;

import org.springframework.boot.actuate.endpoint.web.annotation.RestControllerEndpoint;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import javax.validation.constraints.Size;

@Component
// Enabling this annotation on a class level causes the endpoint to NOT be exposed anymore, it works on a method level
//@Validated
@RestControllerEndpoint(id = "flows")
public class TestEndpoint {

    // Validation here are not working at all
    @GetMapping("/{message}")
    String get(@PathVariable("message") @Size(min = 3) String message) {
        return "Message is " + message;
    }

    @PostMapping
    String post(@RequestBody RequestDto message) {
        return "Message is " + message.getMessage();
    }

}

