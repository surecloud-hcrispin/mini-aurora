package main.controllers;

import main.modules.Attribute;
import main.repositories.AttributeJooqRepository;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
@RequestMapping("api/attributeJooq")
public class AttributeJooqController {
    private final AttributeJooqRepository attributeRepository;

    public AttributeJooqController(AttributeJooqRepository attributeRepository) {
        this.attributeRepository = attributeRepository;
    }

    @GetMapping("/name/{id}")
    public String getAttributeNameById(@PathVariable Long id) {
        return attributeRepository.findNameById(id);
    }

    @GetMapping("/{id}")
    public Attribute getById(@PathVariable Long id) {
        return attributeRepository.findById(id);
    }
}