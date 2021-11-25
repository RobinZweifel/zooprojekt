package ch.bbw.rz.controller;

import ch.bbw.rz.model.Animal;
import ch.bbw.rz.service.ZookeeperService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class NavigationController {

    @Autowired
    AnimalController animalController;

    @Autowired
    EnclosureController enclosureController;

    @Autowired
    private ZookeeperService ZookeeperService;
    @Autowired
    ZookeeperController zookeeperController;

    @GetMapping("/animals")
    public String getAnimals(Model model){

        model.addAttribute("animals", animalController.getAllAnimals());
        return "animals";
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

    @GetMapping("/zookeepers")
    public String getZookeepers(Model model){
        model.addAttribute("zookeepers", ZookeeperService.getZookeepers());
        return "zookeepers";
    }

    @GetMapping("/addAnimal")
    public String getAddAnimal(Model model){
        model.addAttribute("animal", new Animal());
        System.out.println("MOIN");
        return "addAnimal";
    }
}
