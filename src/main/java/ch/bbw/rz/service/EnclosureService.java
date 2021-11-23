package ch.bbw.rz.service;

import ch.bbw.rz.model.Enclosure;
import ch.bbw.rz.repos.EnclosureRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EnclosureService {
    @Autowired
    private EnclosureRepository enclosureRepository;

    public Enclosure saveEnclosure(Enclosure enclosure) {
        return enclosureRepository.save(enclosure);
    }

    /*public List<Enclosure> saveEnclosures(List<Enclosure> enclosures) {
        return enclosureRepository.saveAll(enclosures);
    }

     */

    public List<Enclosure> getEnclosures() {
        return enclosureRepository.findAll();
    }

    /*public Enclosure getEnclosureById(int id) {
        return enclosureRepository.findById(id).orElse(null);
    }

     */

    /*
    public Enclosure getEnclosureByName(String name) {
        return enclosureRepository.findEnclosureByName(name);
    }
     */

    /*public String deleteEnclosure(int id) {
        enclosureRepository.deleteById(id);
        return "Enclosure removed !! " + id;
    }
     */
}
