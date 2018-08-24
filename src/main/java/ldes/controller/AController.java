package ldes.controller;

import ldes.Model.FirBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.LinkedHashMap;

@RestController
public class AController {

    @GetMapping("/a/geta/{id}")
    public String getA(@PathVariable("id")String id){
        LinkedHashMap a = new LinkedHashMap();
        return "getA:AAAa" + id;
    }

    @Autowired
    private FirBean firBean;

    @GetMapping("/a/testInit")
    public String testInit(){
        System.out.println(firBean.toString());
        return null;
    }
}
