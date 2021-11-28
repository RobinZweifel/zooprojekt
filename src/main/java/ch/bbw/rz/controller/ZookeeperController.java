package ch.bbw.rz.controller;

import ch.bbw.rz.model.Zookeeper;
import ch.bbw.rz.service.ZookeeperService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ZookeeperController {
    @Autowired
    private ZookeeperService zookeeperService;

    @PostMapping(path = "/addZookeeper")
    public @ResponseBody Zookeeper newZookeeper (Zookeeper zookeeper){
        return zookeeperService.saveZookeeper(zookeeper);
    }

    @GetMapping(path = "/allZookeepers")
    public @ResponseBody Iterable<Zookeeper> getAllZookeepers(){
        return zookeeperService.getZookeepers();
    }

    @GetMapping(path = "/deleteZookeeper/{id}")
    public String deleteById(@PathVariable("id") int id) {
        zookeeperService.deleteZookeeper(id);
        return "ZookeeperDeleted";
    }

}
