package ch.bbw.rz.service;

import ch.bbw.rz.model.Zookeeper;
import ch.bbw.rz.repos.ZookeeperRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ZookeeperService {
    @Autowired
    private ZookeeperRepository zookeeperRepository;

    public Zookeeper saveZookeeper(Zookeeper zookeeper) {
        /*
        zookeeper.setAge(55);
        Enclosure enclosure = new Enclosure();
        zookeeper.setEnclosure(enclosure);
        zookeeper.setId(1);
        zookeeper.setName("Haans");
         */
        return zookeeperRepository.save(zookeeper);
    }

    public String deleteZookeeper(int id) {
        zookeeperRepository.deleteById(id);
        System.out.println("Delete Zookeeper function triggered");
        return "Zookeeper removed !! " + id;
    }

    public List<Zookeeper> getZookeepers() {
        return zookeeperRepository.findAll();
    }

    /*
    public List<Zookeeper> saveZookeepers(List<Zookeeper> zookeepers) {
        return zookeeperRepository.saveAll(zookeepers);
    }

    public Zookeeper getZookeeperById(int id) {
        return zookeeperRepository.findById(id).orElse(null);
    }

    public Zookeeper getZookeeperByName(String name) {
        return zookeeperRepository.findByName(name);
    }
     */

}
