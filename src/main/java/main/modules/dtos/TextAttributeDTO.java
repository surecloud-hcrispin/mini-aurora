package main.modules.dtos;

import main.modules.enums.AttributeTypes;

public class TextAttributeDTO extends AttributeDTO{
    public final String description;
    public final Enum<AttributeTypes> attributeType;
    public final boolean large;
    public final String placeholder;

    public TextAttributeDTO(String name, String description, Enum<AttributeTypes> attributeType, boolean large, String placeholder) {
        this.name = name;
        this.description = description;
        this.attributeType = attributeType;
        this.large = large;
        this.placeholder = placeholder;
    }
}
