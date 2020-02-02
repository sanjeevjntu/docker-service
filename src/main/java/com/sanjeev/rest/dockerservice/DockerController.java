package com.sanjeev.rest.dockerservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DockerController {

    @GetMapping("/docker/hello")
    public String getHello() {
        return "Hello Docker";
    }

}
