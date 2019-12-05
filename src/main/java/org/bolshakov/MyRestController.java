package org.bolshakov;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class MyRestController {


    // reach tp the endpoint
    @GetMapping("/hello")
    public String sayHello(){
        return "Hello rest";
    }
}
