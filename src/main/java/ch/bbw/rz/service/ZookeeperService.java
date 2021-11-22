package ch.bbw.rz.service;

import ch.bbw.rz.model.Zookeeper;
import ch.bbw.rz.repos.ZookeeperRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ZookeeperService {
    @Autowired
    private ZookeeperRepository ZookeeperRepository;

    public Zookeeper saveZookeeper(Zookeeper Zookeeper) {
        return ZookeeperRepository.save(Zookeeper);
    }

    public List<Zookeeper> saveZookeepers(List<Zookeeper> Zookeepers) {
        return ZookeeperRepository.saveAll(Zookeepers);
    }

    public List<Zookeeper> getZookeepers() {
        return ZookeeperRepository.findAll();
    }

    public Zookeeper getZookeeperById(int id) {
        return ZookeeperRepository.findById(id).orElse(null);
    }

    public Zookeeper getZookeeperByName(String name) {
        return ZookeeperRepository.findByName(name);
    }

    public String deleteZookeeper(int id) {
        ZookeeperRepository.deleteById(id);
        return "Zookeeper removed !! " + id;
    }
}
