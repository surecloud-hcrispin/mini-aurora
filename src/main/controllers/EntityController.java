package main.controllers;

import main.modules.ApplicationEntity;
import main.modules.Attribute;
import main.services.EntityService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
@RequestMapping("api/entity")
public class EntityController {
    private final EntityService entityService;

    public EntityController(EntityService entityService) {
        this.entityService = entityService;
    }

    @GetMapping("")
    public List<ApplicationEntity> getAllEntities(){
        return  this.entityService.getEntities();
    }

    @PostMapping("/add")
    public void addEntity(@RequestBody ApplicationEntity entity){
        this.entityService.createEntity(entity);
    }

    @GetMapping("/{id}")
    public ApplicationEntity getEntity(@PathVariable String id){
        try {
            long bigIntValue = Long.valueOf(id);
            return this.entityService.getEntity(bigIntValue).get(0);
        } catch (NumberFormatException e) {
            e.printStackTrace();
            return null;
        }
    }
}
