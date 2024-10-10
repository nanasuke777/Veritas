package app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TopController {
    
    @GetMapping("/")
    private String display(){
        return "/index.html";
    }
}
