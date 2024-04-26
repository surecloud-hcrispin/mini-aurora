package main.modules;


import main.modules.dtos.ApplicationEntityDTO;

import javax.persistence.*;
import java.util.List;

@Entity
public class ApplicationEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long id;
    private String name;
    private String description;

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

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    // Getter and Setter methods for 'name'
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Getter and Setter methods for 'description'
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    // Getter and Setter methods for 'views'
    public List<View> getViews() {
        return views;
    }

    public void setViews(List<View> views) {
        this.views = views;
    }

}
