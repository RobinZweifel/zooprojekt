package ch.bbw.rz.model;

import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.*;

@Table(name = "enclosure")
@Entity
@DynamicInsert
@DynamicUpdate
public class Enclosure {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @ManyToOne()
    @JoinColumn(name = "species_id")
    private Species species;

    @Column(name = "capacity")
    private int capacity;

    @Column(name = "type")
    private String type;

    @OneToOne
    @JoinColumn(name = "zookeeper_id")
    private Zookeeper zookeeper;

    public Zookeeper getZookeeper() {
        return zookeeper;
    }

    public void setZookeeper(Zookeeper zookeeper) {
        this.zookeeper = zookeeper;
    }

    public Enclosure(int id, Species species, int capacity, String type, Zookeeper zookeeper) {
        this.id = id;
        this.species = species;
        this.capacity = capacity;
        this.type = type;
        this.zookeeper = zookeeper;
    }

    public Enclosure(){
        
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public Species getSpecies() {
        return species;
    }

    public void setSpecies(Species species) {
        this.species = species;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}