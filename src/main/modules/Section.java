package main.modules;

import lombok.Getter;
import lombok.Setter;
import main.modules.enums.Layouts;

import jakarta.persistence.*;
import java.util.List;

@Getter
@Entity
public class Section {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    protected Long id;

    @Setter
    private String name;

    @Setter
    @OneToMany(mappedBy = "id")
    private List<EntityColumn> entityColumns;

    @Setter
    private Layouts layout;

    @Setter
    private Boolean showName;


    public Section(List<EntityColumn> entityColumns, String name, Layouts layout, Boolean showName){
        this.entityColumns = entityColumns;
        this.name = name;
        this.layout = layout;
        this.showName = showName;
    }
    public Section () {
    }

}
