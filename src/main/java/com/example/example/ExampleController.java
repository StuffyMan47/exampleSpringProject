package com.example.example;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ExampleController {
    @GetMapping
    public String hellowWorld(Model model){
        var message = "world";
        model.addAttribute("message", message);
        return "main.html";
    }
}
