package Main.Repositories;

import Main.Modules.ApplicationEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EntityRepository extends JpaRepository<ApplicationEntity, Long> {
    @Query(value = "SELECT * FROM entity", nativeQuery = true)
    List<ApplicationEntity> getAllEntities();
}