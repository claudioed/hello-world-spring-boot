package com.claudioliveira;

import org.springframework.stereotype.Service;

/**
 * Created by claudio on 25/05/15.
 */
@Service
public class HelloWorldService {
    
    public String helloWorld(){
        return "Hello World Spring Boot";
    }

}
