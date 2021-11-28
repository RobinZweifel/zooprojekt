package ch.bbw.rz.controller;

import ch.bbw.rz.model.Animal;
import ch.bbw.rz.model.Enclosure;
import ch.bbw.rz.model.Zookeeper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class NavigationController {

    @Autowired
    AnimalController animalController;

    @Autowired
    EnclosureController enclosureController;

    @Autowired
    ZookeeperController zookeeperController;

    @GetMapping("/animals")
    public String getAnimals(Model model){
        model.addAttribute("animals", animalController.getAllAnimals());
        return "animals";
    }

    @GetMapping("/addAnimal")
    public String getAddAnimal(Model model){
        model.addAttribute("animal", new Animal());
        return "addAnimal";
    }

    /*
    @PostMapping Mapping("/deleteAnimal/{}")
    public String deleteAnimalById(int id){
        animalController.deleteById(id);
        return "finished deleting";
    }
     */

    @GetMapping("/enclosures")
    public String getEnclosures(Model model){
        model.addAttribute("enclosures", enclosureController.getAllEnclosures());
        return "enclosures";
    }

    @GetMapping("/addEnclosure")
    public String getAddEnclosure(Model model){
        model.addAttribute("enclosure", new Enclosure());
        return "addEnclosure";
    }

    @GetMapping("/zookeepers")
    public String getZookeepers(Model model){
        model.addAttribute("zookeepers", zookeeperController.getAllZookeepers());
        return "zookeepers";
    }

    @GetMapping("/addZookeeper")
    public String getAddZookeeper(Model model){
        model.addAttribute("zookeeper", new Zookeeper());
        return "addZookeeper";
    }
}
