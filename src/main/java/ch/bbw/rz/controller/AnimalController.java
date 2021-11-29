package ch.bbw.rz.controller;

import ch.bbw.rz.model.Animal;
import ch.bbw.rz.service.AnimalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class AnimalController {

    @Autowired
    private AnimalService animalService;

    @PostMapping(path = "/addAnimal")
    public Animal newAnimal(Animal animal) {
        return animalService.saveAnimal(animal);
    }

    @RequestMapping(value = "/animals")
    public List<Animal> getAllAnimals() {
        return animalService.getAnimals();
    }

    /*
    @GetMapping(path = "/allAnimals")
    public @ResponseBody Iterable<Animal> getAllAnimals() {
        return animalService.getAnimals();
    }
     */

    @GetMapping(path = "/deleteAnimal/{id}")
    public String deleteById(@PathVariable("id") int id) {
        animalService.deleteAnimal(id);
        return "AnimalDeleted";
    }

/*
    @PutMapping("/updateAnimal")
    public void updateAnimal(){
        animalService.updateAnimal();
        System.out.println("test");
    }
 */

    @PutMapping("/updateAnimal")
    public void update() {
        animalService.updateAnimal(1);
    }

}
