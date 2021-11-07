package ch.bbw.rz.controller;

import ch.bbw.rz.model.Animal;
import ch.bbw.rz.model.Enclosure;
import ch.bbw.rz.repos.AnimalRepository;
import ch.bbw.rz.repos.EnclosureRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping(path = "/zoo")
public class DataController {
    @Autowired
    private AnimalRepository animalRepository;

    @Autowired
    private EnclosureRepository enclosureRepository;

    @PostMapping(path = "/addAnimal")
    public @ResponseBody
    String newAnimal (@RequestParam String name, @RequestParam int weight, @RequestParam int age){
        Animal a = new Animal();
        a.setName(name);
        a.setWeight(weight);
        a.setAge(age);
        return "Saved";
    }

    @GetMapping(path = "/allAnimals")
    public @ResponseBody Iterable<Animal> getAllAnimals(){
        return animalRepository.findAll();
    }

    @PostMapping(path = "/addEnclosure")
    public @ResponseBody
    String newEnclosure (@RequestParam String type, @RequestParam int capacity){
        Enclosure e = new Enclosure();
        e.setType(type);
        e.setCapacity(capacity);
        return "Saved";
    }

    @GetMapping(path = "/allEnclosures")
    public @ResponseBody Iterable<Enclosure> getAllEnclosures(){
        return enclosureRepository.findAll();
    }


}
