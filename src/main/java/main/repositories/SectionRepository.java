package main.repositories;

import main.modules.Section;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface SectionRepository  extends JpaRepository<Section, Long> {
    @Query(value = "SELECT * FROM Section", nativeQuery = true)
    List<Section> getAllViews();
}
