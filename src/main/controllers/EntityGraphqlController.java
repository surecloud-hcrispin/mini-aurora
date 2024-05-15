package main.controllers;

import main.modules.ApplicationEntity;
import main.repositories.EntityRepository;
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
}
