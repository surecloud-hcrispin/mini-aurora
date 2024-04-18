package Main.Repositories;

import Main.Modules.View;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ViewRepository extends JpaRepository<View, Long> {

    @Query(value = "SELECT * FROM View", nativeQuery = true)
    List<View> getAllViews();
}
