package ch.bbw.rz.controller;

import ch.bbw.rz.model.Enclosure;
import ch.bbw.rz.service.EnclosureService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;


@Controller
public class EnclosureController {

    @Autowired
    private EnclosureService enclosureService;

    @PostMapping(path = "/addEnclosure")
    public @ResponseBody Enclosure newEnclosure ( Enclosure enclosure){
        return enclosureService.saveEnclosure(enclosure);
    }

    @GetMapping(path = "/allEnclosures")
    public @ResponseBody Iterable<Enclosure> getAllEnclosures(){
        return enclosureService.getEnclosures();
    }

    @GetMapping(path = "/deleteEnclosure/{id}")
    public String deleteById(@PathVariable("id") int id) {
        enclosureService.deleteEnclosure(id);
        return "EnclosureDeleted";
    }


}
