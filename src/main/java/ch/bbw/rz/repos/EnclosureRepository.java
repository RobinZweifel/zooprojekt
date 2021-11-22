package ch.bbw.rz.repos;

import ch.bbw.rz.model.Enclosure;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EnclosureRepository extends JpaRepository<Enclosure, Integer> {
    Enclosure findByName(String name);

}
