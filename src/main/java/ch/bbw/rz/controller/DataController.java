package ch.bbw.rz.controller;

import ch.bbw.rz.model.Animal;
import ch.bbw.rz.repos.AnimalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping(path = "/zoo")
public class DataController {
    @Autowired
    private AnimalRepository animalRepository;

    @PostMapping(path = "/add")
    public @ResponseBody
    String newAnimal (@RequestParam String name, @RequestParam int weight, @RequestParam int age){
        Animal a = new Animal();
        a.setName(name);
        a.setWeight(weight);
        a.setAge(age);
        return "Saved";
    }

    @GetMapping(path = "/all")
    public @ResponseBody Iterable<Animal> getAllAnimals(){
        return animalRepository.findAll();
    }


}
