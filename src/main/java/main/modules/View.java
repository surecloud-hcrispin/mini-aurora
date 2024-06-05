package main.modules;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Entity
public class View {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    protected Long id;

    @Setter
    private String name;

    @Setter
    private String description;

    @Setter
    @OneToMany(mappedBy = "id")
    private List<Section> sections;


    public View(String name, List<Section> sections, String description){
        this.name = name;
        this.sections = sections;
        this.description = description;
    }

    public View() {
    }

}
