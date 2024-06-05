package main.modules;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Entity
public class EntityColumn {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Setter
    @OneToMany(mappedBy = "id")
    private List<Attribute> attributes;

    public EntityColumn(List<Attribute> attributes) {
        this.attributes = attributes;
    }
    public EntityColumn(){

    }
}
