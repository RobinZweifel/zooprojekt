package ch.bbw.rz.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class NavigationController {

    @Autowired
    DataController dataController;

    @GetMapping("/animals")
    public String getAnimals(Model model){
        model.addAttribute("animals", dataController.getAllAnimals());
        return "animals";
    }

    @GetMapping("/enclosures")
    public String getEnclosures(Model model){
        model.addAttribute("enclosures", dataController.getAllEnclosures());
        return "enclosures";
    }

}
