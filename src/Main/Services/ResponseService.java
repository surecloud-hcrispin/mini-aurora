package Main.Services;

import Main.Modules.Attribute;
import Main.Modules.TextAttribute;
import Main.Repositories.AttributeRepository;
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

    public List<TextAttribute> getAllTextResponses(){
        return attributeRepository.getAllTextResponses();
    }

    public Attribute createTextResponses(TextAttribute attribute) {
        return attributeRepository.save(attribute);
    }

}