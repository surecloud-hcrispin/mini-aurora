package main.modules;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import main.modules.enums.AttributeTypes;



@Entity
public class Attribute {
    protected String name;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    protected Long id;
    protected Enum<AttributeTypes> type;

    public Attribute(String name){
        this.name = name;
    }



    //Default constructor
    public Attribute(){}

    public String getName(){
        return name;
    }

    public void setName(String name){
        //TODO Validate
        this.name = name;
    }
}
