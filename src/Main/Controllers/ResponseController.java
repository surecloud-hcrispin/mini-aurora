package Main.Controllers;

import Main.Modules.Attribute;
import Main.Modules.TextAttribute;
import Main.Services.ResponseService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/response")
public class ResponseController {
    private final ResponseService responseService;

    public ResponseController(ResponseService responseService) {
        this.responseService = responseService;
    }

    @GetMapping("/getAll")
    public List<TextAttribute> getAllTextResponses(){
        return  this.responseService.getAllTextResponses();
    }
    @PostMapping("/addText")
    public void addTextResponse(@RequestBody TextAttribute attribute){
        this.responseService.createTextResponses(attribute);
    }

}
