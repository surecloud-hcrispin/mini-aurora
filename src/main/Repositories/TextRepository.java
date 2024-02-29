package main.Repositories;

import main.Modules.TextResponse;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TextRepository extends JpaRepository<TextResponse, Long> {
    @Query(value = "SELECT * FROM text_response", nativeQuery = true)
    List<TextResponse> getAllTextResponses();
}
