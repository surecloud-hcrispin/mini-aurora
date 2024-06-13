package main.graphqlTests;

import main.controllers.EntityGraphqlController;
import main.modules.ApplicationEntity;
import main.modules.dtos.ApplicationEntityDTO;
import main.repositories.EntityRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.ArgumentMatchers;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
class EntityGraphqlControllerTest {

//    @Autowired
    @Mock
    private EntityRepository entityRepository;

    @InjectMocks
    private EntityGraphqlController entityGraphqlController;

    private ApplicationEntity entity;


    @BeforeEach
    void setUp() {
        entity = new ApplicationEntity(new ApplicationEntityDTO("Test Name", "Test Description"));
    }

    @Test
    void testEntities() {
        when(entityRepository.getAllEntities()).thenReturn(Collections.singletonList(entity));

        List<ApplicationEntity> entities = entityGraphqlController.entities();

        assertEquals(1, entities.size());
        assertEquals("Test Name", entities.getFirst().getName());
        assertEquals("Test Description", entities.getFirst().getDescription());
        verify(entityRepository, times(1)).getAllEntities();
    }


    @Test
    void testCreateEntity() {
        when(entityRepository.save(ArgumentMatchers.any(ApplicationEntity.class))).thenReturn(entity);

        ApplicationEntity createdEntity = entityGraphqlController.createEntity("Test Name", "Test Description");

        assertEquals("Test Name", createdEntity.getName());
        assertEquals("Test Description", createdEntity.getDescription());
        verify(entityRepository, times(1)).save(ArgumentMatchers.any(ApplicationEntity.class));
    }

    @Test
    void testUpdateEntity() {
        when(entityRepository.getEntity(1L)).thenReturn(Collections.singletonList(entity));
        when(entityRepository.save(entity)).thenReturn(entity);

        ApplicationEntity updatedEntity = entityGraphqlController.updateEntity(1L, "Updated Name", "Updated Description");

        assertEquals("Updated Name", updatedEntity.getName());
        assertEquals("Updated Description", updatedEntity.getDescription());
        verify(entityRepository, times(1)).getEntity(1L);
        verify(entityRepository, times(1)).save(entity);
    }

    @Test
    void testDeleteEntity() {
        when(entityRepository.getEntity(1L)).thenReturn(Collections.singletonList(entity));
        doNothing().when(entityRepository).delete(entity);

        Long deletedId = entityGraphqlController.deleteEntity(1L);

        assertEquals(1L, deletedId);
        verify(entityRepository, times(1)).getEntity(1L);
        verify(entityRepository, times(1)).delete(entity);
    }
}