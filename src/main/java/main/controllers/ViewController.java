package main.controllers;

import main.modules.View;
import main.repositories.ViewRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/view")
public class ViewController {
    private final ViewRepository viewRepository;

    public ViewController(ViewRepository viewRepository) {
        this.viewRepository = viewRepository;
    }
    @GetMapping("")
    public Iterable<View> getViews() {
        return viewRepository.findAll();
    }
}
