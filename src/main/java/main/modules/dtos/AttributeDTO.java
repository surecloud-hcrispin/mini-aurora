package main.modules.dtos;


public class AttributeDTO {
    protected  String name;
    public AttributeDTO() {
        // TODO document why this constructor is empty
    }
    public AttributeDTO(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
}
