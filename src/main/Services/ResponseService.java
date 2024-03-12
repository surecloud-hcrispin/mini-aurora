package main.Services;

import main.Entities.Attribute;
import main.Repositories.AttributeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ResponseService {

    private final AttributeRepository attributeRepository;
    @Autowired
    public ResponseService(AttributeRepository attributeRepository) {

        this.attributeRepository = attributeRepository;
    }

    public List<Attribute> getAllTextResponses(){
        return attributeRepository.getAllTextResponses();
    }

    public Attribute createTextResponses(Attribute attribute) {
        return attributeRepository.save(attribute);
    }

}