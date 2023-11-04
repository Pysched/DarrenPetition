package com.example.DarrensPetitions.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;

@Controller
public class PetitionController {
    static List<String> petitions = new ArrayList<>();

    @RequestMapping("/")
    public String index(Model model) {
        model.addAttribute("title", "Darren's Petitions");
        model.addAttribute("petitions", petitions);
        return "index";
    }

    @RequestMapping(value="create", method= RequestMethod.GET)
    public String createPetition(Model model) {
        model.addAttribute("title", "Create a Petition");
        return "create";
    }

    @RequestMapping(value = "create", method = RequestMethod.POST)
    public String processCreatePetition(
            @RequestParam String petitionTitle) {
        petitions.add(petitionTitle);
        return "redirect:";
    }

    @RequestMapping(value = "search", method = RequestMethod.GET)
    public String searchPetition(Model model) {
        model.addAttribute("title", "Search for a Petition");
        return "search";
    }

    @RequestMapping(value = "result", method = RequestMethod.GET)
    public String searchResultPetition(Model model) {
        model.addAttribute("title", "Review Petition Result");
        return "result";
    }

}
