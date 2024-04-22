package main.controllers;

import main.modules.Attribute;
import main.modules.NumberAttribute;
import main.modules.TextAttribute;
import main.services.ResponseService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/response")
public class ResponseController {
    private final ResponseService responseService;

    public ResponseController(ResponseService responseService) {
        this.responseService = responseService;
    }

    @GetMapping("")
    public List<Attribute> getAllResponses(){
        return  this.responseService.getAllResponses();
    }
    @PostMapping("/addText")
    public void addTextResponse(@RequestBody TextAttribute attribute){
        this.responseService.createTextResponses(attribute);
    }
    @PostMapping("/addNumber")
    public void addNumberResponse(@RequestBody NumberAttribute attribute){
        this.responseService.createNumberResponses(attribute);
    }

}
