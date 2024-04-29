package main.modules;

import jakarta.persistence.*;
import java.util.List;

@Entity
public class View {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    protected Long id;
    private String name;
    private String description;

    @OneToMany(mappedBy = "id")
    private List<Section> sections;


    public View(String name, List<Section> sections, String description){
        this.name = name;
        this.sections = sections;
        this.description = description;
    }

    public View() {

    }

    public Long getId() {
        return id;
    }

    public List<Section> getSections() {
        return sections;
    }

    public void setSections(List<Section> sections) {
        this.sections = sections;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
