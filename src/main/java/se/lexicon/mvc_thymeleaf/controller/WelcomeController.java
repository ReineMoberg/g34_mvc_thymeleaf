package se.lexicon.mvc_thymeleaf.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/welcome")
public class WelcomeController {

    @GetMapping("/")
    public String gotoIndexPage(){
        System.out.println("Helloooooooooooooo");
        return "index";
    }

}
