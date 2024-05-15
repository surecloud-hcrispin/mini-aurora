package main.controllers;

import main.modules.ApplicationEntity;
import main.repositories.EntityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.graphql.data.method.annotation.SchemaMapping;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Controller
public class EntityGraphqlController {
    private final EntityRepository entityRepository;

    @Autowired
    public EntityGraphqlController(EntityRepository entityRepository) {
        this.entityRepository = entityRepository;
    }

    @SchemaMapping(typeName = "Query", value = "entities")
    @QueryMapping
    public List<ApplicationEntity> entities(){

        return entityRepository.getAllEntities();
    }
}
