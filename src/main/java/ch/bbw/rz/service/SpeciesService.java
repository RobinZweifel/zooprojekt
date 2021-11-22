package ch.bbw.rz.service;

import ch.bbw.rz.model.Species;
import ch.bbw.rz.repos.SpeciesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SpeciesService {

    @Autowired
    private SpeciesRepository SpeciesRepository;

    public Species saveSpecies(Species species) {
        return SpeciesRepository.save(species);
    }

    public List<Species> saveSpeciess(List<Species> speciess) {
        return SpeciesRepository.saveAll(speciess);
    }

    public List<Species> getSpeciess() {
        return SpeciesRepository.findAll();
    }

    public Species getSpeciesById(int id) {
        return SpeciesRepository.findById(id).orElse(null);
    }

    public Species getSpeciesByName(String name) {
        return SpeciesRepository.findByName(name);
    }

    public String deleteSpecies(int id) {
        SpeciesRepository.deleteById(id);
        return "Species removed !! " + id;
    }
}

