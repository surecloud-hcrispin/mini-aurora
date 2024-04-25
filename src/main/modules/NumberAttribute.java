package main.modules;

import main.modules.dtos.NumberAttributeDTO;
import main.modules.enums.AttributeTypes;
import javax.persistence.Entity;

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

    public String getGuidance() {
        return guidance;
    }
    public void setGuidance(String guidance) {
        this.guidance = guidance;
    }
    public String getPlaceholder() {
        return placeholder;
    }
    public void setPlaceholder(String placeholder) {
        this.placeholder = placeholder;
    }
}
