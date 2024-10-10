package app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class NouhinController {
	
    @PostMapping("/nouhin")
    private String display(){
        return "/nouhin.html";
    }

}
