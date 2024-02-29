package main.Services;

import main.Modules.TextResponse;
import main.Repositories.TextRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ResponseService {

    private final TextRepository textRepository;
    @Autowired
    public ResponseService(TextRepository textRepository) {

        this.textRepository = textRepository;
    }

    public List<TextResponse> getAllTextResponses(){
        return textRepository.getAllTextResponses();
    }

    public TextResponse createTextResponses(TextResponse textResponse) {
        return textRepository.save(textResponse);
    }

}