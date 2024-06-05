package main.services;

import main.modules.View;
import main.repositories.ViewRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ViewService {
    private final ViewRepository viewRepository;

    @Autowired
    public ViewService(ViewRepository viewRepository){
        this.viewRepository = viewRepository;
    }

    public List<View> getAllViews(){
        return viewRepository.getAllViews();
    }
}
