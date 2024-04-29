package main.modules;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class EntityColumn {

    @OneToMany(mappedBy = "id")
    private List<Attribute> attributes;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    public EntityColumn(List<Attribute> attributes) {
        this.attributes = attributes;
    }
    public EntityColumn(){

    }
}
