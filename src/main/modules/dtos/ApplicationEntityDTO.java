package main.modules.dtos;

import main.modules.enums.AttributeTypes;

public class ApplicationEntityDTO {
    public final String name;
    public final String description;
    public final Enum<AttributeTypes> attributeType;

    public ApplicationEntityDTO(String name, String description, Enum<AttributeTypes> attributeType) {
        this.name = name;
        this.description = description;
        this.attributeType = attributeType;

    }
}
