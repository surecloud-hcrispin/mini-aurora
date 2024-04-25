package main.controllers;

import main.modules.Attribute;
import main.modules.NumberAttribute;
import main.modules.TextAttribute;
import main.services.ResponseService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
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

    @GetMapping("/{id}")
    public Attribute getResponse(@PathVariable String id){
        try {
            long bigIntValue = Long.valueOf(id);
            return this.responseService.getResponse(bigIntValue).get(0);
        } catch (NumberFormatException e) {
            e.printStackTrace();
            return null;
        }
    }
}
