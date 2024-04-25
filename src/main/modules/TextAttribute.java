package main.modules;

import main.modules.dtos.TextAttributeDTO;
import main.modules.enums.AttributeTypes;

import javax.persistence.Entity;

@Entity
public class TextAttribute extends Attribute {
    private boolean large;
    private String placeholder;

    public TextAttribute() {
        type = AttributeTypes.TEXT;
    }

    public TextAttribute(TextAttributeDTO attribute) {
        this.type = attribute.attributeType;
        this.name = attribute.getName();
        this.large = attribute.large;
        this.placeholder = attribute.placeholder;
    }

    public String getPlaceholder() {
        return placeholder;
    }

    public void setPlaceholder(String placeholder) {
        //TODO Validation
        this.placeholder = placeholder;
    }

    public boolean getLarge() {
        return large;
    }

    public void setLarge( boolean large) {
        //TODO Validation
        this.large = large;
    }
}
