package com.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
@Controller
public class StartApplication {

    @GetMapping("/")
    public String index(final Model model) {
        model.addAttribute("title", "Space + Program");
        model.addAttribute("msg", "Component A is running!");
        return "index";
    }
    @GetMapping("/health")
    public String healthCheck() {
        return "health";
    }

    public static void main(String[] args) {
        SpringApplication.run(StartApplication.class, args);
    }

}
