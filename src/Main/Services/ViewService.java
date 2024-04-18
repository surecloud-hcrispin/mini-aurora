package Main.Services;

import Main.Modules.View;
import Main.Repositories.ViewRepository;
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
