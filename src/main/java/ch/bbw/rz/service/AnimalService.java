package ch.bbw.rz.service;

import ch.bbw.rz.model.Animal;
import ch.bbw.rz.model.Enclosure;
import ch.bbw.rz.model.Species;
import ch.bbw.rz.repos.AnimalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AnimalService {
    @Autowired
    private AnimalRepository animalRepository;

    public Animal saveAnimal(Animal animal) {
        animal.setName("TestAnimal");
        animal.setAge(10);
        animal.setWeight(129);
        animal.setColor("red");
        Species species = new Species();
        species.setId(1);
        animal.setSpecies(species);
        Enclosure enclosure = new Enclosure();
        enclosure.setId(1);
        animal.setEnclosure(enclosure);
        return animalRepository.save(animal);

    }

    public List<Animal> saveAnimals(List<Animal> animals) {
        return animalRepository.saveAll(animals);
    }

    public List<Animal> getAnimals() {
        return animalRepository.findAll();
    }

    public Animal getAnimalById(int id) {
        return animalRepository.findById(id).orElse(null);
    }

    public Animal getAnimalByName(String name) {
        return animalRepository.findByName(name);
    }

    public String deleteAnimal(int id) {
        animalRepository.deleteById(id);
        return "Animal removed !! " + id;
    }
}
