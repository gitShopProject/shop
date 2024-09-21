package study.shopstudys.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BasicController {

    @GetMapping("/")
    public String hello() {
        return "index.html";
    }
    
    @GetMapping("/about")
    public String about() {
        return "마이페이지임";
    }

}
