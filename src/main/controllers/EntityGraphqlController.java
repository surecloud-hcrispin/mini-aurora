package main.controllers;

import main.modules.ApplicationEntity;
import main.modules.dtos.ApplicationEntityDTO;
import main.repositories.EntityRepository;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
public class EntityGraphqlController {
    private final EntityRepository entityRepository;


    public EntityGraphqlController(EntityRepository entityRepository) {
        this.entityRepository = entityRepository;
    }

    @QueryMapping
    public List<ApplicationEntity> entities(){

        return entityRepository.getAllEntities();
    }

    @MutationMapping
    public ApplicationEntity createEntity(@Argument String name, @Argument String description){
        ApplicationEntityDTO appEntity = new ApplicationEntityDTO(name, description);
        return entityRepository.save(new ApplicationEntity(appEntity));
    }

    @MutationMapping
    public ApplicationEntity updateEntity(@Argument Long id, @Argument String name, @Argument String description){
        ApplicationEntity updated = entityRepository.getEntity(id).get(0);
        if(name != null && !name.equals(updated.getName())){
            updated.setName(name);
        }
        if(description != null && !description.equals(updated.getDescription())){
            updated.setDescription(description);
        }
        return entityRepository.save(updated);
    }

    @MutationMapping
    public Long deleteEntity(@Argument Long id){
        entityRepository.delete(entityRepository.getEntity(id).get(0));
        return id;
    }
}
