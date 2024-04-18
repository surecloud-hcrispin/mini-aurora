package Main.Repositories;

import Main.Modules.TextAttribute;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AttributeRepository extends JpaRepository<TextAttribute, Long> {
    @Query(value = "SELECT * FROM text_response", nativeQuery = true)
    List<TextAttribute> getAllTextResponses();
}
