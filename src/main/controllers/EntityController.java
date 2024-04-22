package main.controllers;

import main.modules.ApplicationEntity;
import main.services.EntityService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/entity")
public class EntityController {
    private final EntityService entityService;

    public EntityController(EntityService entityService) {
        this.entityService = entityService;
    }

    @PostMapping("/add")
    public void addEntity(@RequestBody ApplicationEntity entity){
        this.entityService.createEntity(entity);
    }
}
