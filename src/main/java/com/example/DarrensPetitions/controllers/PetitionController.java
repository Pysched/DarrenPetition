package com.example.DarrensPetitions.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller

public class PetitionController {
    @RequestMapping("/")
    public String index(Model model) {
        model.addAttribute("title", "Darren's Petitions");
        return "index";
    }
}
