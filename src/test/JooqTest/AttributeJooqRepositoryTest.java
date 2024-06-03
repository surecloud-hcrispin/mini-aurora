//package JooqTest;
//
//import main.repositories.AttributeJooqRepository;
//import org.junit.jupiter.api.Test;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.autoconfigure.jooq.JooqTest;
//import org.springframework.boot.testcontainers.service.connection.ServiceConnection;
//import org.springframework.context.annotation.Import;
//import org.springframework.test.context.jdbc.Sql;
//import org.testcontainers.containers.PostgreSQLContainer;
//import org.testcontainers.junit.jupiter.Container;
//import org.testcontainers.junit.jupiter.Testcontainers;
//
//import static org.assertj.core.api.Assertions.assertThat;
//
//@JooqTest
//@Import({AttributeJooqRepository.class})
//@Testcontainers
//@Sql("classpath:/test-data.sql")
//public class AttributeJooqRepositoryTest {
//
//    @Container
//    @ServiceConnection
//    static final PostgreSQLContainer<?> postgres =
//            new PostgreSQLContainer<>("postgres:16-alpine");
//
//    @Autowired
//    AttributeJooqRepository attributeJooqRepository;
//
//    @Test
//    void findUserNameById() {
//        String username = attributeJooqRepository.findNameById(1L);
//        assertThat(username).isEqualTo("Admin");
//    }
//}
