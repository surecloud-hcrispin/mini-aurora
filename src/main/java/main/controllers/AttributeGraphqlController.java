package main.controllers;

import main.modules.Attribute;
import main.modules.dtos.AttributeDTO;
import main.repositories.AttributeRepository;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
public class AttributeGraphqlController {
    private final AttributeRepository attributeRepository;


    public AttributeGraphqlController(AttributeRepository attributeRepository) {
        this.attributeRepository = attributeRepository;
    }

    @QueryMapping
    public List<Attribute> attributes(){

        return attributeRepository.getAllResponses();
    }

    @MutationMapping
    public Attribute createAttribute(@Argument String name){
        AttributeDTO attribute = new AttributeDTO(name);
        return attributeRepository.save(new Attribute(attribute));
    }

    @MutationMapping
    public Attribute updateAttribute(@Argument Long id, @Argument String name){
        Attribute updated = attributeRepository.getResponse(id).get(0);
        if(name != null && !name.equals(updated.getName())){
            updated.setName(name);
        }
        return attributeRepository.save(updated);
    }

    @MutationMapping
    public Long deleteAttribute(@Argument Long id){
        attributeRepository.delete(attributeRepository.getResponse(id).get(0));
        return id;
    }
}
