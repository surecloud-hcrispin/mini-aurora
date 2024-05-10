package main.modules;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;
import main.modules.dtos.NumberAttributeDTO;
import main.modules.enums.AttributeTypes;

@Setter
@Getter
@Entity
public class NumberAttribute extends Attribute {

    private String guidance;

    private String placeholder;

    public NumberAttribute() {
        type = AttributeTypes.NUMBER;
    }
    public NumberAttribute(String guidance, String placeholder) {
        this.guidance = guidance;
        this.placeholder = placeholder;
        type = AttributeTypes.NUMBER;
    }

    public NumberAttribute(NumberAttributeDTO attributeDTO) {
        this.guidance = attributeDTO.guidance;
        this.placeholder = attributeDTO.placeholder;
        type = AttributeTypes.NUMBER;
        this.name = attributeDTO.getName();
    }
}
