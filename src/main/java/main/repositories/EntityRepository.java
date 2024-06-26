package main.repositories;

import main.modules.ApplicationEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EntityRepository extends JpaRepository<ApplicationEntity, Long> {

    @Query(value = "SELECT * FROM application_entity", nativeQuery = true)
    List<ApplicationEntity> getAllEntities();

    @Query(value = "SELECT * FROM application_entity WHERE id = :id", nativeQuery = true)
    List<ApplicationEntity> getEntity(@Param("id") Long id);
}