package main.RepositoryTests;

import main.repositories.EntityRepository;
import main.modules.ApplicationEntity;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.transaction.annotation.Transactional;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;

@SpringBootTest
@Transactional
@Rollback
public class EntityRepositoryTest {

    @BeforeEach
    void setUp() {
        // Initialize test data
        ApplicationEntity entity1 = new ApplicationEntity();
        entity1.setName("Entity 1");

        ApplicationEntity entity2 = new ApplicationEntity();
        entity2.setName("Entity 2");

        entityRepository.save(entity1);
        entityRepository.save(entity2);
    }


    @Autowired
    private EntityRepository entityRepository;

    @Test
    public void testGetAllEntities() {
        List<ApplicationEntity> entityList = entityRepository.getAllEntities();
        assertThat(entityList).hasSize(2);
        assertThat(entityList.get(0).getName()).isEqualTo("Entity 1");
        assertThat(entityList.get(1).getName()).isEqualTo("Entity 2");
    }

    @Test
    public void testGetEntityById() {
        List<ApplicationEntity> entity = entityRepository.getEntity(1L);
        assertThat(entity).hasSize(1);
        assertThat(entity.getFirst().getName()).isEqualTo("Entity 1");
    }
}
