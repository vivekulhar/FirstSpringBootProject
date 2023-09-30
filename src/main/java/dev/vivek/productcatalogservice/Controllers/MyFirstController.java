package dev.vivek.productcatalogservice.Controllers;

import dev.vivek.productcatalogservice.Services.MyFirstService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

//@Controller
@RestController
public class MyFirstController {
    private MyFirstService myFirstService;

    public MyFirstController(MyFirstService myFirstService) {
        this.myFirstService = myFirstService;
    }

    @GetMapping("/")
    public String sayHi(){
        return "Hey there";
    }
}
