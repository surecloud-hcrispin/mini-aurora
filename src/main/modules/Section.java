package main.modules;

import main.modules.enums.Layouts;

import javax.persistence.*;
import javax.persistence.Entity;
import java.util.List;

@Entity
public class Section {
    private String name;

    @OneToMany(mappedBy = "id")
    private List<EntityColumn> entityColumns;
    private Layouts layout;
    private Boolean showName;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    protected Long id;

    public Section(List<EntityColumn> entityColumns, String name, Layouts layout, Boolean showName){
        this.entityColumns = entityColumns;
        this.name = name;
        this.layout = layout;
        this.showName = showName;
    }
    public Section () {

    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public List<EntityColumn> getColumns() {
        return entityColumns;
    }

    public void setColumns(List<EntityColumn> entityColumns) {
        this.entityColumns = entityColumns;
    }

    public Layouts getLayout() {
        return layout;
    }

    public void setLayout(Layouts layout) {
        this.layout = layout;
    }

    public Boolean getShowName() {
        return showName;
    }

    public void setShowName(Boolean showName) {
        this.showName = showName;
    }

}
