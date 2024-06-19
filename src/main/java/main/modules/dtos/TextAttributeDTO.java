package main.modules.dtos;

import main.modules.enums.AttributeTypes;

public class TextAttributeDTO extends AttributeDTO{
    public final Enum<AttributeTypes> attributeType;
    public final boolean large;
    public final String placeholder;

    public TextAttributeDTO(String name, boolean large, String placeholder) {
        this.name = name;
        this.attributeType = AttributeTypes.TEXT;
        this.large = large;
        this.placeholder = placeholder;
    }
}
