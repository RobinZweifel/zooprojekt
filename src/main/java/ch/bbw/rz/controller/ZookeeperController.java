package ch.bbw.rz.controller;

import ch.bbw.rz.model.Zookeeper;
import ch.bbw.rz.service.ZookeeperService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ZookeeperController {
    @Autowired
    private ZookeeperService ZookeeperService;


    @PostMapping(path = "/addZookeeper")
    public @ResponseBody
    Zookeeper newZookeeper (@RequestBody Zookeeper zookeeper){
        return ZookeeperService.saveZookeeper(zookeeper);
    }

    @GetMapping(path = "/allZookeepers")
    public @ResponseBody Iterable<Zookeeper> getAllZookeepers(){
        return ZookeeperService.getZookeepers();
    }

}
