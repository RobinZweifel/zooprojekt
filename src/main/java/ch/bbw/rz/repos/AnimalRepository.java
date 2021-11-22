package ch.bbw.rz.repos;

import ch.bbw.rz.model.Animal;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AnimalRepository extends JpaRepository<Animal, Integer> {
    Animal findByName(String name);
}
