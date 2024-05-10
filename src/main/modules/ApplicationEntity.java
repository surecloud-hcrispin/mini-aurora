package main.modules;

import java.util.List;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import main.modules.dtos.ApplicationEntityDTO;

@Getter
@Entity
public class ApplicationEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    protected Long id;
    @Setter
    private String name;
    @Setter
    private String description;

    @Setter
    @OneToMany(mappedBy = "id")
    private List<View> views;

    public ApplicationEntity(Long id, String name, String description, List<View> views) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.views = views;
    }

    public ApplicationEntity(ApplicationEntityDTO entity) {
        name = entity.name;
        description = entity.description;

    }

    public ApplicationEntity() {

    }

}
