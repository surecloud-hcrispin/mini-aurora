package main.modules;

import lombok.Getter;
import lombok.Setter;
import main.modules.dtos.TextAttributeDTO;
import main.modules.enums.AttributeTypes;

import jakarta.persistence.Entity;

@Setter
@Getter
@Entity
public class TextAttribute extends Attribute {

    private boolean large;

    private String placeholder;

    public TextAttribute(String name, boolean large, String placeholder){
        type = AttributeTypes.TEXT;
        this.name = name;
        this.large = large;
        this.placeholder = placeholder;
    }

    public TextAttribute(TextAttributeDTO attribute) {
        this.type = attribute.attributeType;
        this.name = attribute.getName();
        this.large = attribute.large;
        this.placeholder = attribute.placeholder;
    }

    public TextAttribute() {
        type = AttributeTypes.TEXT;
    }
}
