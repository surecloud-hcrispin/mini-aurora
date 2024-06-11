package main.RepositoryTests;

import main.modules.Attribute;
import main.repositories.AttributeRepository;
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
class AttributeRepositoryTest {

    @BeforeEach
    void setUp() {
        // Initialize test data
        Attribute attribute1 = new Attribute();
        attribute1.setName("Entity 1");

        Attribute attribute2 = new Attribute();
        attribute2.setName("Entity 2");

        attributeRepository.save(attribute1);
        attributeRepository.save(attribute2);
    }


    @Autowired
    private AttributeRepository attributeRepository;

    @Test
    void testGetAllEntities() {
        List<Attribute> responseList = attributeRepository.getAllResponses();
        assertThat(responseList).hasSize(2);
        assertThat(responseList.get(0).getName()).isEqualTo("Entity 1");
        assertThat(responseList.get(1).getName()).isEqualTo("Entity 2");
    }

    @Test
    void testGetEntityById() {
        List<Attribute> response = attributeRepository.getResponse(1L);
        assertThat(response).hasSize(1);
        assertThat(response.getFirst().getName()).isEqualTo("Entity 1");
    }
}
