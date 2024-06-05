package main.modules;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;
import main.modules.enums.AttributeTypes;



@Getter
@Entity
public class Attribute {
    @Setter
    protected String name;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    protected Long id;
    @Setter
    protected Enum<AttributeTypes> type;

    public Attribute(String name){
        this.name = name;
    }

    //Default constructor
    public Attribute(){}
}
