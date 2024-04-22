package main.repositories;

import main.modules.Attribute;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AttributeRepository extends JpaRepository<Attribute, Long> {
    @Query(value = "SELECT * FROM \"attribute\"", nativeQuery = true)
    List<Attribute> getAllResponses();
}
