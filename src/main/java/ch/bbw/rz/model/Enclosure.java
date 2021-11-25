package ch.bbw.rz.model;

import javax.persistence.*;

@Table(name = "enclosure", indexes = {
        @Index(name = "zookeeper_id", columnList = "zookeeper_id")
})
@Entity
public class Enclosure {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @ManyToOne(optional = false)
    @JoinColumn(name = "species_id", nullable = false)
    private Species species;

    @Column(name = "capacity", nullable = false)
    private int capacity;

    @Column(name = "type", nullable = false)
    private String type;

    @OneToOne
    @MapsId
    @JoinColumn(name = "zookeeper_id")
    private Zookeeper zookeeper;

    public Zookeeper getZookeeper() {
        return zookeeper;
    }

    public void setZookeeper(Zookeeper zookeeper) {
        this.zookeeper = zookeeper;
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