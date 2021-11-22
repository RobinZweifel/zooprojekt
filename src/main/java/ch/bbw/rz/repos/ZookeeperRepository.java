package ch.bbw.rz.repos;

import ch.bbw.rz.model.Zookeeper;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ZookeeperRepository extends JpaRepository<Zookeeper, Integer> {
    Zookeeper findByName(String name);
}
