package main.services;

import main.modules.ApplicationEntity;
import main.repositories.EntityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EntityService {
    private final EntityRepository entityRepository;

    @Autowired
    public EntityService(EntityRepository entityRepository) {

        this.entityRepository = entityRepository;
    }

    public List<ApplicationEntity> getAllEntities(){
        return entityRepository.getAllEntities();
    }

    public ApplicationEntity createEntity(ApplicationEntity applicationEntity) {
        return entityRepository.save(applicationEntity);
    }

}
