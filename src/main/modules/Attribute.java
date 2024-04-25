package main.modules;

import main.modules.enums.AttributeTypes;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Attribute {
    protected String name;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long id;
    protected Enum<AttributeTypes> type;

    public Attribute(String name){
        this.name = name;
    }

    //Default constructor
    public Attribute(){
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        //TODO Validate
        this.name = name;
    }
}
