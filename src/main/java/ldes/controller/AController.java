package ldes.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AController {

    @GetMapping("/a/geta/{id}")
    public String getA(@PathVariable("id")String id){
        return "getA:AAAa" + id;
    }
}
