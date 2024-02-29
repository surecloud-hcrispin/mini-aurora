package main.Modules;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class TextResponse {
    private String name;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    public TextResponse(String name){
        this.name = name;
    }

    //Default constructor
    public TextResponse(){}

    public String getName(){
        return name;
    }

    public void setName(String name){
        //TODO Validate
        this.name = name;
    }
}
