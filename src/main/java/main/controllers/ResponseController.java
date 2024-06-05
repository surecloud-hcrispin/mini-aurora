package main.controllers;

import main.modules.Attribute;
import main.modules.NumberAttribute;
import main.modules.TextAttribute;
import main.modules.dtos.NumberAttributeDTO;
import main.modules.dtos.TextAttributeDTO;
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
    public Attribute addTextResponse(@RequestBody TextAttributeDTO attribute){
        TextAttribute newAttribute = new TextAttribute(attribute);
        return this.responseService.createTextResponses(newAttribute);
    }

    @PostMapping("/addNumber")
    public Attribute addNumberResponse(@RequestBody NumberAttributeDTO attribute){
        NumberAttribute newAttribute = new NumberAttribute(attribute);
        return this.responseService.createNumberResponses(newAttribute);
    }

    @SuppressWarnings("CallToPrintStackTrace")
    @GetMapping("/{id}")
    public Attribute getResponse(@PathVariable String id){
        try {
            long bigIntValue = Long.parseLong(id);
            return this.responseService.getResponse(bigIntValue).get(0);
        } catch (NumberFormatException e) {
            //TODO Add proper Logging
            e.printStackTrace();
            return null;
        }
    }
}
