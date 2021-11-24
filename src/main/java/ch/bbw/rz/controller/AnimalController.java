package ch.bbw.rz.controller;

import ch.bbw.rz.model.Animal;
import ch.bbw.rz.service.AnimalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class AnimalController {

    @Autowired
    private AnimalService animalService;

    @PostMapping(path = "/addAnimal")
    public @ResponseBody
    Animal newAnimal (@RequestBody Animal animal){
        return animalService.saveAnimal(animal);
    }

    @GetMapping(path = "/allAnimals")
    public @ResponseBody Iterable<Animal> getAllAnimals(){
        return animalService.getAnimals();
    }

    @GetMapping(path = "/deleteAnimal/{id}")
    public String deleteById(@PathVariable("id") int id) {
        animalService.deleteAnimal(id);
        return "AnimalDeleted";
    }
}
