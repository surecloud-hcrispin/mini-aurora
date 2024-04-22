package main.modules;

import main.modules.enums.AttributeTypes;

import javax.persistence.Entity;

@Entity
public class NumberAttribute extends Attribute {
    private String guidance;
    private String placholder;

    public NumberAttribute() {
        type = AttributeTypes.NUMBER;
    }
    public NumberAttribute(String guidance, String placholder) {}
}
