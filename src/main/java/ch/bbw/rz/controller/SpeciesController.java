package ch.bbw.rz.controller;

import ch.bbw.rz.model.Species;
import ch.bbw.rz.service.SpeciesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SpeciesController {

    @Autowired
    private SpeciesService speciesService;


    @PostMapping(path = "/addSpecies")
    public @ResponseBody
    Species newSpecies (@RequestBody Species species){
        return speciesService.saveSpecies(species);
    }

    @GetMapping(path = "/allSpeciess")
    public @ResponseBody Iterable<Species> getAllSpeciess(){
        return speciesService.getSpeciess();
    }

}
