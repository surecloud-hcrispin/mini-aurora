package main.Controllers;

import main.Entities.Attribute;
import main.Services.ResponseService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/response")
public class ResponseController {
    private final ResponseService responseService;

    public ResponseController(ResponseService responseService) {
        this.responseService = responseService;
    }

    @GetMapping
    public List<Attribute> getAllTextResponses(){
        return  this.responseService.getAllTextResponses();
    }
    @PostMapping("/add")
    public void addTextResponse(@RequestBody Attribute attribute){
        this.responseService.createTextResponses(attribute);
    }

}
