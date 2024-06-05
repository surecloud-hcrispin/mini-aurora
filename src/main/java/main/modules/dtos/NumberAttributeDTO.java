package main.modules.dtos;

public class NumberAttributeDTO extends AttributeDTO {
    public final String guidance;
    public final String placeholder;

    public NumberAttributeDTO(String guidance, String placeholder, String name) {
        this.guidance = guidance;
        this.placeholder = placeholder;
        this.name = name;

    }
}
