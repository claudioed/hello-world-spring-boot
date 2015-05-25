package com.claudioliveira;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by claudio on 25/05/15.
 */
@RestController
@RequestMapping("/api")
public class HelloWorldResource {

    private final HelloWorldService helloWorldService;

    @Autowired
    public HelloWorldResource(HelloWorldService helloWorldService) {
        this.helloWorldService = helloWorldService;
    }

    @RequestMapping(value = "/hello",method = RequestMethod.GET)
    public ResponseEntity<String> helloWorld(){
        return new ResponseEntity<>(helloWorldService.helloWorld(), HttpStatus.OK);
    }

}
