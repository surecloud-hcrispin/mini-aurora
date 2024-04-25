package main.services;

import main.modules.Attribute;
import main.modules.NumberAttribute;
import main.modules.TextAttribute;
import main.repositories.AttributeRepository;
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

    public List<Attribute> getAllResponses(){
        return attributeRepository.getAllResponses();
    }

    public List<Attribute> getResponse(Long id){
        return attributeRepository.getResponse(id);
    }

    public Attribute createTextResponses(TextAttribute attribute) {
        return attributeRepository.save(attribute);
    }

    public Attribute createNumberResponses(NumberAttribute attribute) {
        return attributeRepository.save(attribute);
    }
}